<template>

  <div>
   <h1>  {{name}}:{{level}}</h1>
    <p>当前经验：{{ExNedd}}万</p>
    <p>升级需要:&nbsp;&nbsp;&nbsp;{{ExNow}}万</p>




  </div>
</template>

<script>
import { getEX} from "@/api";

export default {
  data(){
    return{
      name:'',
      level:"",
      ExNow:'',
      ExNedd:''


    }
  },
  mounted() {
    getEX().then(({data}) => {
      const {name,experienceNow,experienceNeed,level} = data.data

      this.name=name;
      this.ExNow=experienceNow;
      this.ExNedd=experienceNeed;
      this.level=level;

  })}

}
</script>

<style scoped>

</style>