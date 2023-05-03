const { defineConfig } = require('@vue/cli-service')
module.exports = defineConfig({
    transpileDependencies: true,
    publicPath:'./',    //打包路径
    lintOnSave:false,  //简单命名
})
