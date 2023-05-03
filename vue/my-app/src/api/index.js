import http from '../utils/request'
// 使用utils下的工具类封装具体请求方法,请求方法层

// 请求首页数据
export const getData=()=>{
    // 返回promise对象，就可以.then截获内容
    return http.get('/home/getData')
}


export const getMenu=(data)=>{
    // 返回promise对象，就可以.then截获内容
    return http.post('/permission/getMenu',data)
}