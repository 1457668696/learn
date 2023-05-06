import axios from "axios";


// 封装一个基础实例
const http = axios.create({
    // 通用请求前缀
    timeout:5000,
    headers:{
        
    }
})


// 请求拦截
http.interceptors.request.use(function (config) {

    // 请求前操作
    return config;
}),function (error){

    // 请求错误操作
    return Promise.reject(error)
}



// 响应拦截
http.interceptors.response.use(function (response) {

    // 响应前操作



    return response;
}),function (error){




    // 响应错误操作
    return Promise.reject(error)
}











// 暴露
export default http