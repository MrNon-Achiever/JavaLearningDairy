let trs=document.querySelectorAll('tr');
for(let i=0;i<trs.length;i++){
    trs[i].addEventListener('mouseenter',function(){
        this.style.backgroundColor='#f2e2e2';
    });
    trs[i].addEventListener('mouseleave',function(){
        this.style.backgroundColor='#fff';
    })
}