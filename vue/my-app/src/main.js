import Vue from 'vue'
import App from './App.vue'
import Element from 'element-ui'
import 'element-ui/lib/theme-chalk/index.css'
// import {Button} from "element-ui";
import router from "./router/index";
import './api/mock'
import Cookie from "js-cookie";
import store from "@/store";

Vue.config.productionTip = false

// 全局注入
Vue.use(Element)
Vue.use(router)


router.beforeEach((to,from,next)=>{
  const token=Cookie.get('token')

  // token不存在且跳转业务页时
  if(!token && to.name!=='login'){
    next({name:'login'})
  }else if (token && to.name==='login'){
    next({name:'home'})
  }else {
    next()
  }
}
)


// 按需引入
// Vue.use(Button)

new Vue({
  store,
  router,
  render: h => h(App),
  created() {
    store.commit('addMenu',router)
  }
}).$mount('#app')
