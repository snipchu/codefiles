
function toggleplay() {
  mp3audio = document.getElementById("mp3audio");
  mp3playbutton = document.querySelector(".mp3playbutton");
  console.log(mp3playbutton);
  if (mp3audio.paused) {
    mp3audio.play();
    mp3playbutton.classList.add("nf-fa-pause");
    mp3playbutton.classList.remove("nf-fa-play");
  } else {
    mp3audio.pause();
    mp3playbutton.classList.remove("nf-fa-pause");
    mp3playbutton.classList.add("nf-fa-play");
  }
}
