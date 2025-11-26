document.addEventListener("DOMContentLoaded",function(){
    setTimeout(function(){
        let trs=document.querySelectorAll('tr');
    for(let i=1;i<trs.length;i++){
        trs[i].addEventListener('mouseenter',()=>{
            trs[i].style.backgroundColor='#f2e2e2';
        })
        trs[i].addEventListener('mouseleave',()=>{
            trs[i].style.backgroundColor='#fff';
        })
    }   
    },100);
})