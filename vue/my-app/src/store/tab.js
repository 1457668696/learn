import Cookie from "js-cookie";
import Router from "@/router";
export default {
    state: {
        isCollapse: false,      /*控制菜单展开还是收起*/
        menu:[]
    },

    mutations: {
        collapseMenu(state) {
            state.isCollapse = !state.isCollapse
        },

        // 设置菜单
        setMenu(state, val) {
            state.menu = val
            // 存入缓存,cookie必须是字符串可以要转换
            Cookie.set('menu',JSON.stringify(val))
        },

        // 动态路由注册
        addMenu(state,router){
               // 判断缓存中是否有数据
               if (!Cookie.get('menu')) return

               const menu=JSON.parse(Cookie.get('menu'))
               state.menu=menu

              const menuArray=[]
               menu.forEach(item=>{
                   if(item.children){
                       item.children.map(item=>{
                           item.component= ()=>import(`../views/${item.url}`)
                           return item;
                       })
                       menuArray.push(...item.children)
                   }else {
                       item.component= ()=>import(`../views/${item.url}`)
                       menuArray.push(item)
                   }

                   menuArray.forEach(item=>{
                       router.addRoute('main',item)
                   })

               })

        }

    }

}