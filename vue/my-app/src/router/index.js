import Vue from 'vue'
import VueRouter from 'vue-router'
import HomePage from "@/views/HomePage.vue";
import UserPage from "@/views/UserPage.vue";
import MainPage from "@/views/MainPage.vue";
import PageOne from "@/views/PageOne.vue";
import PageTwo from "@/views/PageTwo.vue";
import MallPage from "@/views/MallPage.vue";
import loginPage from "@/views/loginPage.vue";
// 1.引入组件

// 2.全局使用
Vue.use(VueRouter)

//3.组件映射规则
const routes=[

    // 主路由
      {  path: '/',component: MainPage,
          // 是/的时候跳转到home
          redirect:'/home',
          name:'main',

        children:[
            // {path:'/home',component: HomePage},
            // {path:'/user',component: UserPage},
            // {path:'/mall',component: MallPage},
            // {path:'/page1',component: PageOne},
            // {path:'/page2',component: PageTwo}
        ]},


    // 单独的页面同级写
    {
        path: '/login',name:'login',component: loginPage
    }
]



// 4.挂载
const router=new VueRouter({
    routes
})

// 导出到main
export default router