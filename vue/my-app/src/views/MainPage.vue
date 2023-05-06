<template>
 <div>


<!--   布局（flex原理）-->





     <el-container>
<!--     边栏,组件封装-->
         <el-aside width="auto">
             <common-aside />
         </el-aside>
     <el-container>


<!--       导航，组件封装-->
       <el-header>
         <common-header />
       </el-header>


<!--       主体，使用路由出口-->
       <el-main>
         <router-view></router-view>
       </el-main>



     </el-container>
   </el-container>
 </div>
</template>

<script>

import CommonAside from "@/components/CommonAside.vue";
import CommonHeader from "@/components/CommonHeader.vue";
export default {
  data(){
    return{


    }
  },
  components:{
    CommonAside,
    CommonHeader
  }
}
</script>

<style scoped>
.el-header{
  padding: 0;
}

</style>