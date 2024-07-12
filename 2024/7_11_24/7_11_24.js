const songlist = [
  ["September", "Earth, Wind & Fire", "./September.mp3"],
  ["Harvey","Her's","./Harvey.mp3"],
  ["Spunky (Makoto's Stage)","Hideki Okugawa","./Spunky.mp3"]
]
let songindex = 0;
function toggleplay() {
  mp3audio = document.getElementById("mp3audio");
  mp3playbutton = document.querySelector(".mp3playbutton");
  if (mp3audio.paused) {
    mp3audio.play();
    mp3playbutton.classList.replace("nf-fa-play", "nf-fa-pause");
  } else {
    mp3audio.pause();
    mp3playbutton.classList.replace("nf-fa-pause", "nf-fa-play");
  }
}
function changevol(amount) { mp3audio.volume += amount; }
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
  progbar.value = mp3audio.currentTime/mp3audio.duration * 100;
  progbar.previousElementSibling.innerHTML = numtotime(mp3audio.currentTime);
}
function changesong(index) {
  // play next song
  mp3src = document.getElementById("mp3src");
  songindex += index;
  if (songindex == songlist.length) {songindex--;}
  if (songindex == -1) {songindex++;}
  mp3src.src = songlist[songindex][2];
  mp3audio.load();
  if (index != 0) { mp3audio.play(); }

  // update html after audio loads
  mp3audio.onloadedmetadata = function() {
    mp3audio.previousElementSibling.previousElementSibling.innerHTML = songlist[songindex][0];
    mp3audio.previousElementSibling.innerHTML = songlist[songindex][1];
    progbar.nextElementSibling.innerHTML = numtotime(mp3audio.duration);
    progbarupdate();
  };
}
