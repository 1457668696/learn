//当前网页
let url = location.href

//匹配热门页面
let regExp = /heats/

//方法
if (regExp.exec(url)) {

    console.log("当前正在热门页面")
    
        let page = document.querySelector('.pg').querySelectorAll('a')
        if (page.length > 0) {

            for (let i = 0; i < page.length; i++) {
               let pageOne = page[i].getAttribute("href").concat('&orderby=heats')
            
                page[i].setAttribute('href',pageOne)
            }

        

    }


}
else{
    console.log('需进入热门页面启动脚本')
}