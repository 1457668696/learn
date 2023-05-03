import Mock from 'mockjs'
import homeApi from '../api/mockServeData/home'
import permission from "@/api/mockServeData/permission";
// 使用Mock拦截请求处理（模拟后端），记得main.js引入，主层


// 定义mock请求拦截,url,type,fun
Mock.mock('/api/home/getData','get',homeApi.getStatisticalData())


Mock.mock(/api\/permission\/getMenu/, 'post',permission.getMenu)



