<template>

  <div class="header-container">

    <!--    左边内容-->
    <div class="l-content">
      <el-button @click="handleMenu" icon="el-icon-menu" size="mini"></el-button>
      <span class="text">首页</span>
    </div>

    <!--    右边内容-->
    <div class="r-content">

      <el-dropdown @command="handleClick">

            <span class="el-dropdown-link">
                  <img class="user" src="../assets/images/user.png" alt="">

           </span>
        <el-dropdown-menu slot="dropdown">
          <el-dropdown-item>个人中心</el-dropdown-item>
          <el-dropdown-item command="cancel">登出</el-dropdown-item>
        </el-dropdown-menu>
      </el-dropdown>

    </div>
  </div>

</template>

<script>
import Cookie from "js-cookie";


export default {
  data() {
    return {}
  },
  methods: {

    // 下拉菜单的事件逻辑和事件委托类似,在总下拉绑定，然后传入回调参数
    handleClick(command) {
      if (command === 'cancel') {
        Cookie.remove('token')
        Cookie.remove('menu')
        this.$router.push('login')
        location.reload();
      }
    },
    handleMenu() {
      this.$store.commit('collapseMenu')
    }


  }
}
</script>

<style lang="less" scoped>
.header-container {
  //布局，flex，主轴平分两端，侧轴居中
  display: flex;
  justify-content: space-between;
  align-items: center;
  background-color: #333;
  height: 60px;
  padding-left: 20px;

  .text {
    font-size: 14px;
    color: white;
    margin-left: 10px;

  }

  .r-content {

    .user {
      height: 48px;
      height: 40px;
      border-radius: 50%;
      margin-right: 10px;

    }
  }
}


</style>