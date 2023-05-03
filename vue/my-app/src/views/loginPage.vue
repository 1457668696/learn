<template>
  <!--登录页-->

<!--  inline行内表单-->
  <el-form ref="form" label-width="70px" :inline="true" :model="form" :rules="rules" class="login-container">
    <h3 class="login_title">系统登录</h3>

    <el-form-item label="用户名" prop="username">
      <el-input v-model="form.username" placeholder="请输入账号"></el-input>
    </el-form-item>

    <el-form-item label="密码" prop="password">
      <el-input type="password" v-model="form.password" placeholder="请输入密码"></el-input>
    </el-form-item>

    <el-button
        @click="submit()"
        style="margin-left: 115px;margin-top: 10px" type="primary">登录</el-button>

  </el-form>

</template>

<script>
import Mock from 'mockjs'
import Cookies from 'js-cookie'
import { getMenu } from "@/api";

export default {
  data() {
    return {
      form: {
        username: '',
        password: ''
      },
      rules: {
        username: [
          {required: true, trigger: 'blur', message: '请输入用户名'}
        ],
        password: [
          {required: true, trigger: 'blur', message: '请输入用户名'}
        ]
      }

    }
  },
  methods:{
    submit(){

    // 生成token模拟
    // const token= Mock.Random.guid()

    //  存入cookie
    //  Cookies.set('token',token)

      // 1.检验表单
      this.$refs.form.validate((valid)=>{
        if(valid){
          getMenu(this.form).then(({ data })=>{
            console.log(data)
            if(data.code===20000){
              Cookies.set('token',data.data.token)

              // 获取数据存入状态
              this.$store.commit('setMenu',data.data.menu)
              this.$store.commit('addMenu',this.$router)
              this.$router.push('/home')
            }else {
              this.$message.error('密码错误');
            }

          })
        }
      })




 }
}
}
</script>

<style lang="less" scoped>

.login-container {
  border: 1px solid #eaeaea;
  width: 350px;
  margin: 180px auto;
  padding: 35px 35px 15px 35px;
  background-color: white;
  border-radius: 15px;
  box-shadow: 0 0 25px #cac6c6;
  box-sizing: border-box;
  .el-input{
    width: 198px;
  }
  .login_title{
    text-align: center;
    margin-bottom: 40px;
    color: #505458;
  }


}
</style>