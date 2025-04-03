const sections = document.querySelectorAll('.seccion');
const upBtn = document.getElementById('up');
const downBtn = document.getElementById('down');
let currentIndex = 0;

function scrollToSection(index) {
  sections[index].scrollIntoView({ behavior: 'smooth' });
}

upBtn.addEventListener('click', () => {
  currentIndex = (currentIndex - 1 + sections.length) % sections.length;
  scrollToSection(currentIndex);
});

downBtn.addEventListener('click', () => {
  currentIndex = (currentIndex + 1) % sections.length;
  scrollToSection(currentIndex);
});
