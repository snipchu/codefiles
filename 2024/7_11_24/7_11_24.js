const songlist = [
  ["September", "Earth, Wind & Fire", "./September.mp3"],
  ["Harvey","Her's","./Harvey.mp3"],
  ["Spunky (Makoto's Stage)","Hideki Okugawa","./Spunky.mp3"]
]
function toggleplay() {
  mp3audio = document.getElementById("mp3audio");
  mp3playbutton = document.querySelector(".mp3playbutton");
  if (mp3audio.paused) {
    mp3audio.play();
    mp3playbutton.classList.replace("nf-fa-pause", "nf-fa-play");
  } else {
    mp3audio.pause();
    mp3playbutton.classList.replace("nf-fa-play", "nf-fa-pause");
  }
}
function changevol(amount) {
  mp3audio.volume += amount;
  console.log(mp3audio.volume);
}
function numtotime(num) {
  min = Math.floor(num/60);
  sec = Math.floor(num%60);
  if (sec<10) {
    sec = "0"+sec;
  }
  return min+":"+sec;
}
function progbarupdate() {
  progbar = document.getElementById("progbar");
  progbar.value = (mp3audio.currentTime / mp3audio.duration) * 100;
  progbar.previousElementSibling.innerHTML = numtotime(mp3audio.currentTime);
}
function changesong(index) {
  mp3audio.pause();
  progbarupdate();
  progbar.nextElementSibling.innerHTML = numtotime(mp3audio.duration);
}
