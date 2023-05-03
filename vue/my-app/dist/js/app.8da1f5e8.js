(function(){var e={5720:function(e,t,a){"use strict";a.r(t),a.d(t,{default:function(){return d}});var n=function(){var e=this,t=e._self._c;return t("el-row",[t("el-col",{staticStyle:{"padding-right":"13px"},attrs:{span:8}},[t("div",{staticClass:"grid-content bg-purple"},[t("el-card",{staticClass:"box-card"},[t("div",{staticClass:"user"},[t("img",{attrs:{src:a(4353),alt:""}}),t("div",{staticClass:"userInfo"},[t("p",{staticClass:"name"},[e._v("Admin")]),t("p",{staticClass:"access"},[e._v("超级管理员")])])]),t("div",{staticClass:"login"},[t("p",[e._v("上次登录时间："),t("span",[e._v("2023.2.3")])]),t("p",[e._v("上次登录地点："),t("span",[e._v("贵州")])])])]),t("el-card",{staticStyle:{"margin-top":"30px",height:"460px"}},[t("el-table",{attrs:{data:e.tableData}},e._l(e.tableLabel,(function(e,a){return t("el-table-column",{key:a,attrs:{prop:a,label:e}})})),1)],1)],1)]),t("el-col",{attrs:{span:16}},[t("div",{staticClass:"num"},e._l(e.countData,(function(a){return t("el-card",{key:a.name,attrs:{"body-style":{display:"flex",padding:0}}},[t("i",{staticClass:"icon",class:`el-icon-${a.icon}`,style:{background:a.color}}),t("div",{staticClass:"detail"},[t("p",{staticClass:"price"},[e._v("￥"+e._s(a.value))]),t("p",{staticClass:"text"},[e._v(e._s(a.name))])])])})),1),t("el-card",{staticStyle:{height:"292px"}},[t("div",{ref:"echarts1",staticStyle:{height:"280px"}})]),t("div",{staticClass:"graph"},[t("el-card",{staticStyle:{height:"260px"}},[t("div",{ref:"echarts2",staticStyle:{height:"260px"}})]),t("el-card",{staticStyle:{height:"260px"}},[t("div",{ref:"echarts3",staticStyle:{height:"260px"}})])],1)],1)],1)},o=[],r=(a(7658),a(586)),l=a(347),s={data(){return{countData:[{name:"今日支付订单",value:1234,icon:"success",color:"#2ec7c9"},{name:"今日收藏订单",value:210,icon:"star-on",color:"#ffb980"},{name:"今日未支付订单",value:1234,icon:"s-goods",color:"#5ab1ef"},{name:"本月支付订单",value:1234,icon:"success",color:"#2ec7c9"},{name:"本月收藏订单",value:210,icon:"star-on",color:"#ffb980"},{name:"本月未支付订单",value:1234,icon:"s-goods",color:"#5ab1ef"}],tableData:[],tableLabel:{name:"课程",todayBuy:"今日购买",monthBuy:"本月购买",totalBuy:"总购买"}}},mounted(){(0,r.Y)().then((e=>{let{data:t}=e;const{tableData:a}=t.data;this.tableData=a;const n=l.S1(this.$refs.echarts1);var o={};const{orderData:r,userData:s,videoData:i}=t.data,u=Object.keys(r.data[0]),c={data:u};o.xAxis=c,o.yAxis={},o.legend=c,o.series=[],u.forEach((e=>{o.series.push({name:e,data:r.data.map((t=>t[e])),type:"line"})})),console.log(o),n.setOption(o);const d=l.S1(this.$refs.echarts2),m={legend:{textStyle:{color:"#333"}},grid:{left:"20%"},tooltip:{trigger:"axis"},xAxis:{type:"category",data:s.map((e=>e.date)),axisLine:{lineStyle:{color:"#17b3a3"}},axisLabel:{interval:0,color:"#333"}},yAxis:[{type:"value",axisLine:{lineStyle:{color:"#17b3a3"}}}],color:["#2ec7c9","#b6a2de"],series:[{name:"新增用户",data:s.map((e=>e.new)),type:"bar"},{name:"活跃用户",data:s.map((e=>e.active)),type:"bar"}]};d.setOption(m);const p=l.S1(this.$refs.echarts3),f={tooltip:{trigger:"item"},color:["#0f78f4","#dd536b","#9462e5","#a6a6a6","#e1bb22","#39c362","#3ed1cf"],series:[{data:i,type:"pie"}]};p.setOption(f)}))}},i=s,u=a(1001),c=(0,u.Z)(i,n,o,!1,null,"649b277e",null),d=c.exports},7173:function(e,t,a){"use strict";a.r(t),a.d(t,{default:function(){return w}});var n=function(){var e=this,t=e._self._c;return t("div",[t("el-container",[t("el-aside",{attrs:{width:"auto"}},[t("common-aside")],1),t("el-container",[t("el-header",[t("common-header")],1),t("el-main",[t("router-view")],1)],1)],1)],1)},o=[],r=function(){var e=this,t=e._self._c;return t("el-menu",{staticClass:"el-menu-vertical-demo",attrs:{"default-active":"1-4-1",collapse:e.isCollapse,"background-color":"#545c64","text-color":"#fff","active-text-color":"#ffd04b"},on:{open:e.handleOpen,close:e.handleClose}},[t("h3",[e._v(e._s(e.isCollapse?"后台":"通用后台管理系统"))]),e._l(e.noChildren,(function(a){return t("el-menu-item",{key:a.name,attrs:{index:a.name},on:{click:function(t){return e.clickMenu(a)}}},[t("i",{class:`el-icon-${a.icon}`}),t("span",{attrs:{slot:"title"},slot:"title"},[e._v(e._s(a.label))])])})),e._l(e.hasChildren,(function(a){return t("el-submenu",{key:a.label,attrs:{index:a.label}},[t("template",{slot:"title"},[t("i",{class:`el-icon-${a.icon}`}),t("span",{attrs:{slot:"title"},slot:"title"},[e._v(e._s(a.label))])]),e._l(a.children,(function(n){return t("el-menu-item-group",{key:n.name},[t("el-menu-item",{attrs:{index:a.name},on:{click:function(t){return e.clickMenu(n)}}},[e._v(e._s(n.label)+" ")])],1)}))],2)}))],2)},l=[],s=(a(7658),a(680)),i={data(){return{}},methods:{handleOpen(e,t){console.log(e,t)},handleClose(e,t){console.log(e,t)},clickMenu(e){this.$route.path===e.path||"/home"===this.$route.path&&"/"===e.path||this.$router.push(e.path)}},computed:{noChildren(){return this.menuData.filter((e=>!e.children))},hasChildren(){return this.menuData.filter((e=>e.children))},isCollapse(){return this.$store.state.tab.isCollapse},menuData(){return JSON.parse(s.Z.get("menu"))||this.$store.state.tab.menu}}},u=i,c=a(1001),d=(0,c.Z)(u,r,l,!1,null,"25456b2a",null),m=d.exports,p=function(){var e=this,t=e._self._c;return t("div",{staticClass:"header-container"},[t("div",{staticClass:"l-content"},[t("el-button",{attrs:{icon:"el-icon-menu",size:"mini"},on:{click:e.handleMenu}}),t("span",{staticClass:"text"},[e._v("首页")])],1),t("div",{staticClass:"r-content"},[t("el-dropdown",{on:{command:e.handleClick}},[t("span",{staticClass:"el-dropdown-link"},[t("img",{staticClass:"user",attrs:{src:a(4353),alt:""}})]),t("el-dropdown-menu",{attrs:{slot:"dropdown"},slot:"dropdown"},[t("el-dropdown-item",[e._v("个人中心")]),t("el-dropdown-item",{attrs:{command:"cancel"}},[e._v("登出")])],1)],1)],1)])},f=[],h={data(){return{}},methods:{handleClick(e){"cancel"===e&&(s.Z.remove("token"),s.Z.remove("menu"),this.$router.push("login"),location.reload())},handleMenu(){this.$store.commit("collapseMenu")}}},v=h,g=(0,c.Z)(v,p,f,!1,null,"5a163a20",null),b=g.exports,y={data(){return{}},components:{CommonAside:m,CommonHeader:b}},_=y,x=(0,c.Z)(_,n,o,!1,null,"2c1eaaa1",null),w=x.exports},4377:function(e,t,a){"use strict";a.r(t),a.d(t,{default:function(){return u}});var n=function(){var e=this,t=e._self._c;return t("h1",[e._v(" 商品")])},o=[],r={data(){return{}}},l=r,s=a(1001),i=(0,s.Z)(l,n,o,!1,null,"9b0912b8",null),u=i.exports},9942:function(e,t,a){"use strict";a.r(t),a.d(t,{default:function(){return u}});var n=function(){var e=this,t=e._self._c;return t("h1",[e._v(" one")])},o=[],r={data(){return{}}},l=r,s=a(1001),i=(0,s.Z)(l,n,o,!1,null,"088f3661",null),u=i.exports},7656:function(e,t,a){"use strict";a.r(t),a.d(t,{default:function(){return u}});var n=function(){var e=this,t=e._self._c;return t("h1",[e._v(" two")])},o=[],r={data(){return{}}},l=r,s=a(1001),i=(0,s.Z)(l,n,o,!1,null,"6733de21",null),u=i.exports},5148:function(e,t,a){"use strict";a.r(t),a.d(t,{default:function(){return u}});var n=function(){var e=this,t=e._self._c;return t("div",[e._v("用户")])},o=[],r={data(){return{}}},l=r,s=a(1001),i=(0,s.Z)(l,n,o,!1,null,"7c9eaf36",null),u=i.exports},1371:function(e,t,a){"use strict";a.r(t),a.d(t,{default:function(){return d}});var n=function(){var e=this,t=e._self._c;return t("el-form",{ref:"form",staticClass:"login-container",attrs:{"label-width":"70px",inline:!0,model:e.form,rules:e.rules}},[t("h3",{staticClass:"login_title"},[e._v("系统登录")]),t("el-form-item",{attrs:{label:"用户名",prop:"username"}},[t("el-input",{attrs:{placeholder:"请输入账号"},model:{value:e.form.username,callback:function(t){e.$set(e.form,"username",t)},expression:"form.username"}})],1),t("el-form-item",{attrs:{label:"密码",prop:"password"}},[t("el-input",{attrs:{type:"password",placeholder:"请输入密码"},model:{value:e.form.password,callback:function(t){e.$set(e.form,"password",t)},expression:"form.password"}})],1),t("el-button",{staticStyle:{"margin-left":"115px","margin-top":"10px"},attrs:{type:"primary"},on:{click:function(t){return e.submit()}}},[e._v("登录")])],1)},o=[],r=(a(7658),a(7634),a(680)),l=a(586),s={data(){return{form:{username:"",password:""},rules:{username:[{required:!0,trigger:"blur",message:"请输入用户名"}],password:[{required:!0,trigger:"blur",message:"请输入用户名"}]}}},methods:{submit(){this.$refs.form.validate((e=>{e&&(0,l.r)(this.form).then((e=>{let{data:t}=e;console.log(t),2e4===t.code?(r.Z.set("token",t.data.token),this.$store.commit("setMenu",t.data.menu),this.$store.commit("addMenu",this.$router),this.$router.push("/home")):this.$message.error("密码错误")}))}))}}},i=s,u=a(1001),c=(0,u.Z)(i,n,o,!1,null,"6d7f0c4f",null),d=c.exports},586:function(e,t,a){"use strict";a.d(t,{Y:function(){return l},r:function(){return s}});var n=a(4161);const o=n.Z.create({baseURL:"/api",timeout:5e3});o.interceptors.request.use((function(e){return e})),o.interceptors.response.use((function(e){return e}));var r=o;const l=()=>r.get("/home/getData"),s=e=>r.post("/permission/getMenu",e)},221:function(e,t,a){"use strict";var n=a(7754),o=a.n(n),r=a(6369),l=function(){var e=this,t=e._self._c;return t("router-view")},s=[],i={name:"App",components:{}},u=i,c=a(1001),d=(0,c.Z)(u,l,s,!1,null,null,null),m=d.exports,p=a(2631),f=(a(5720),a(5148),a(7173)),h=(a(9942),a(7656),a(4377),a(1371));r["default"].use(p.ZP);const v=[{path:"/",component:f["default"],redirect:"/home",name:"main",children:[]},{path:"/login",name:"login",component:h["default"]}],g=new p.ZP({routes:v});var b=g,y=a(7634),_=a.n(y);a(7658);let x=[];var w={getStatisticalData:()=>{for(let e=0;e<7;e++)x.push(_().mock({"苹果":_().Random.float(100,8e3,0,0),vivo:_().Random.float(100,8e3,0,0),oppo:_().Random.float(100,8e3,0,0),"魅族":_().Random.float(100,8e3,0,0),"三星":_().Random.float(100,8e3,0,0),"小米":_().Random.float(100,8e3,0,0)}));return{code:2e4,data:{videoData:[{name:"小米",value:2999},{name:"苹果",value:5999},{name:"vivo",value:1500},{name:"oppo",value:1999},{name:"魅族",value:2200},{name:"三星",value:4500}],userData:[{date:"周一",new:5,active:200},{date:"周二",new:10,active:500},{date:"周三",new:12,active:550},{date:"周四",new:60,active:800},{date:"周五",new:65,active:550},{date:"周六",new:53,active:770},{date:"周日",new:33,active:170}],orderData:{date:["20191001","20191002","20191003","20191004","20191005","20191006","20191007"],data:x},tableData:[{name:"oppo",todayBuy:500,monthBuy:3500,totalBuy:22e3},{name:"vivo",todayBuy:300,monthBuy:2200,totalBuy:24e3},{name:"苹果",todayBuy:800,monthBuy:4500,totalBuy:65e3},{name:"小米",todayBuy:1200,monthBuy:6500,totalBuy:45e3},{name:"三星",todayBuy:300,monthBuy:2e3,totalBuy:34e3},{name:"魅族",todayBuy:350,monthBuy:3e3,totalBuy:22e3}]}}}},C={getMenu:e=>{const{username:t,password:a}=JSON.parse(e.body);return"admin"===t&&"admin"===a?{code:2e4,data:{menu:[{path:"/home",name:"home",label:"首页",icon:"s-home",url:"HomePage.vue"},{path:"/mall",name:"mall",label:"商品管理",icon:"video-play",url:"MallPage.vue"},{path:"/user",name:"user",label:"用户管理",icon:"user",url:"UserPage.vue"},{label:"其他",icon:"location",children:[{path:"/page1",name:"page1",label:"页面1",icon:"setting",url:"PageOne.vue"},{path:"/page2",name:"page2",label:"页面2",icon:"setting",url:"PageTwo.vue"}]}],token:_().Random.guid(),message:"获取成功"}}:"xiaoxiao"===t&&"xiaoxiao"===a?{code:2e4,data:{menu:[{path:"/home",name:"home",label:"首页",icon:"s-home",url:"HomePage.vue"},{path:"/mall",name:"mall",label:"商品管理",icon:"video-play",url:"MallPage.vue"}],token:_().Random.guid(),message:"获取成功"}}:{code:-999,data:{message:"密码错误"}}}};_().mock("/api/home/getData","get",w.getStatisticalData()),_().mock(/api\/permission\/getMenu/,"post",C.getMenu);var k=a(680),P=a(3822),O={state:{isCollapse:!1,menu:[]},mutations:{collapseMenu(e){e.isCollapse=!e.isCollapse},setMenu(e,t){e.menu=t,k.Z.set("menu",JSON.stringify(t))},addMenu(e,t){if(!k.Z.get("menu"))return;const n=JSON.parse(k.Z.get("menu"));e.menu=n;const o=[];n.forEach((e=>{e.children?(e.children.map((e=>(e.component=()=>a(6968)(`./${e.url}`),e))),o.push(...e.children)):(e.component=()=>a(6968)(`./${e.url}`),o.push(e)),o.forEach((e=>{t.addRoute("main",e)}))}))}}};r["default"].use(P.ZP);var S=new P.ZP.Store({modules:{tab:O}});r["default"].config.productionTip=!1,r["default"].use(o()),r["default"].use(b),b.beforeEach(((e,t,a)=>{const n=k.Z.get("token");n||"login"===e.name?n&&"login"===e.name?a({name:"home"}):a():a({name:"login"})})),new r["default"]({store:S,router:b,render:e=>e(m),created(){S.commit("addMenu",b)}}).$mount("#app")},6968:function(e,t,a){var n={"./HomePage":5720,"./HomePage.vue":5720,"./MainPage":7173,"./MainPage.vue":7173,"./MallPage":4377,"./MallPage.vue":4377,"./PageOne":9942,"./PageOne.vue":9942,"./PageTwo":7656,"./PageTwo.vue":7656,"./UserPage":5148,"./UserPage.vue":5148,"./loginPage":1371,"./loginPage.vue":1371};function o(e){return Promise.resolve().then((function(){if(!a.o(n,e)){var t=new Error("Cannot find module '"+e+"'");throw t.code="MODULE_NOT_FOUND",t}var o=n[e];return a(o)}))}o.keys=function(){return Object.keys(n)},o.id=6968,e.exports=o},4353:function(e,t,a){"use strict";e.exports=a.p+"img/user.36929a03.png"}},t={};function a(n){var o=t[n];if(void 0!==o)return o.exports;var r=t[n]={exports:{}};return e[n].call(r.exports,r,r.exports,a),r.exports}a.m=e,function(){var e=[];a.O=function(t,n,o,r){if(!n){var l=1/0;for(c=0;c<e.length;c++){n=e[c][0],o=e[c][1],r=e[c][2];for(var s=!0,i=0;i<n.length;i++)(!1&r||l>=r)&&Object.keys(a.O).every((function(e){return a.O[e](n[i])}))?n.splice(i--,1):(s=!1,r<l&&(l=r));if(s){e.splice(c--,1);var u=o();void 0!==u&&(t=u)}}return t}r=r||0;for(var c=e.length;c>0&&e[c-1][2]>r;c--)e[c]=e[c-1];e[c]=[n,o,r]}}(),function(){a.n=function(e){var t=e&&e.__esModule?function(){return e["default"]}:function(){return e};return a.d(t,{a:t}),t}}(),function(){a.d=function(e,t){for(var n in t)a.o(t,n)&&!a.o(e,n)&&Object.defineProperty(e,n,{enumerable:!0,get:t[n]})}}(),function(){a.e=function(){return Promise.resolve()}}(),function(){a.g=function(){if("object"===typeof globalThis)return globalThis;try{return this||new Function("return this")()}catch(e){if("object"===typeof window)return window}}()}(),function(){a.o=function(e,t){return Object.prototype.hasOwnProperty.call(e,t)}}(),function(){a.r=function(e){"undefined"!==typeof Symbol&&Symbol.toStringTag&&Object.defineProperty(e,Symbol.toStringTag,{value:"Module"}),Object.defineProperty(e,"__esModule",{value:!0})}}(),function(){a.p=""}(),function(){var e={143:0};a.O.j=function(t){return 0===e[t]};var t=function(t,n){var o,r,l=n[0],s=n[1],i=n[2],u=0;if(l.some((function(t){return 0!==e[t]}))){for(o in s)a.o(s,o)&&(a.m[o]=s[o]);if(i)var c=i(a)}for(t&&t(n);u<l.length;u++)r=l[u],a.o(e,r)&&e[r]&&e[r][0](),e[r]=0;return a.O(c)},n=self["webpackChunkmy_app"]=self["webpackChunkmy_app"]||[];n.forEach(t.bind(null,0)),n.push=t.bind(null,n.push.bind(n))}();var n=a.O(void 0,[998],(function(){return a(221)}));n=a.O(n)})();
//# sourceMappingURL=app.8da1f5e8.js.map