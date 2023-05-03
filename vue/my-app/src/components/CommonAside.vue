<template>
  <el-menu default-active="1-4-1" class="el-menu-vertical-demo"
           @open="handleOpen"
           @close="handleClose"
           :collapse="isCollapse"
           background-color="#545c64"
           text-color="#fff"
           active-text-color="#ffd04b">

    <h3>{{ isCollapse ? "后台" : "通用后台管理系统" }}</h3>

    <!--一级菜单-->
    <el-menu-item
        @click="clickMenu(item)"
        v-for="item in noChildren" :key="item.name" :index="item.name">
      <i :class="`el-icon-${item.icon}`"></i>
      <span slot="title">{{ item.label }}</span>
    </el-menu-item>


    <!--二级下拉菜单-->
    <el-submenu v-for="item in hasChildren" :key="item.label" :index="item.label">
      <template slot="title">
        <i :class="`el-icon-${item.icon}`"></i>
        <span slot="title">{{ item.label }}</span>
      </template>

      <!--      下拉-->
      <el-menu-item-group v-for="subItem in item.children" :key="subItem.name">
        <el-menu-item
            @click="clickMenu(subItem)"
            :index="item.name">{{ subItem.label }}
        </el-menu-item>
      </el-menu-item-group>
    </el-submenu>


  </el-menu>
</template>

<script>
import Cookie from "js-cookie";
export default {
  data() {
    return {
    };
  },
  methods: {
    handleOpen(key, keyPath) {
      console.log(key, keyPath);
    },
    handleClose(key, keyPath) {
      console.log(key, keyPath);
    },


    // 点击路由跳转
    clickMenu(item) {
      // 仅当前路由不一致或者是首页是home的时候才允许,route是当前路由，router是实例
      if (this.$route.path !== item.path && !(this.$route.path === '/home' && (item.path === '/'))) {
        this.$router.push(item.path)
      }
    }
  },
  computed: {

    //   没有子菜单
    noChildren() {
      return this.menuData.filter(item => !item.children)
    },
    //   有子菜单
    hasChildren() {
      return this.menuData.filter(item => item.children)
    },
    // 是否展开
    isCollapse() {
      return this.$store.state.tab.isCollapse
    },
    // 菜单显示控制
    menuData() {
      return JSON.parse(Cookie.get('menu')) || this.$store.state.tab.menu
    }


  }
}
</script>

<!--less语言且只当前组价生效-->
<style lang="less" scoped>


.el-menu-vertical-demo:not(.el-menu--collapse) {

}

.el-menu {
  border-right: solid 0 #e6e6e6;
  height: 100vh;

  h3 {
    color: white;
    text-align: center;
    line-height: 48px;
    font-size: 16px;
    font-weight: 400;
  }
}

</style>