
function copyMenu(){
var dptCategory = document.querySelector('.dpt-cat')
var dptPlace = document.querySelector('.departments')
dptPlace.innerHTML = dptCategory.innerHTML;

var mainNav = document.querySelector('.header-nav nav')
var navPlace = document.querySelector('.off-canvas nav')
navPlace.innerHTML = mainNav.innerHTML;

var topNav = document.querySelector('.header-top .wrapper')
var topPlace = document.querySelector('.off-canvas .thetop-nav')
topPlace.innerHTML = topNav.innerHTML

}
copyMenu()



const menuButton = document.querySelector('.trigger'),
      closeButton = document.querySelector('.t-close'),
      addclass = document.querySelector('.site');

      menuButton.addEventListener('click', ()=>{
        addclass.classList.toggle('showmenu')
      })
    closeButton.addEventListener('click', ()=>{
        addclass.classList.remove('showmenu')
    })








const submenu = document.querySelectorAll('.has-child')
submenu.forEach((menu) => menu.addEventListener('click', toggle))

function toggle(e) {
    e.preventDefault();
    submenu.forEach((item) => item != this ? item.closest('.has-child').classList.remove('expand') : null);
    if (this.closest('.has-child').classList != 'expand');
    this.closest('.has-child').classList.toggle('expand')
}






const swiper = new Swiper('.swiper', {
    loop: true,
  
    // If we need pagination
    pagination: {
      el: '.swiper-pagination',
    },
    
  });


  const searchButton = document.querySelector('.t-search'),
        tClose = document.querySelector('.search-close'),
        showClass = document.querySelector('.site')

searchButton.addEventListener('click',()=>[
  showClass.classList.toggle('showsearch')
])
tClose.addEventListener('click',()=>[
  showClass.classList.remove('showsearch')
])