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
    mp3playbutton.classList.replace("nf-fa-play", "nf-fa-pause");
  } else {
    mp3playbutton.classList.replace("nf-fa-pause", "nf-fa-play");
  }
  mp3audio.paused ? mp3audio.play() : mp3audio.pause();
}
function toggleloop() {
  mp3loopbutton = document.querySelector(".mp3loopbutton");
  mp3audio.loop = !(mp3audio.loop);
  if (mp3audio.loop) {
    mp3loopbutton.classList.replace("nf-md-repeat","nf-md-repeat_once");
  } else {
    mp3loopbutton.classList.replace("nf-md-repeat_once","nf-md-repeat");
  }
}
shuffled = false;
function toggleshuffle() { shuffled = !shuffled; }
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
  !shuffled ? songindex += index : songindex = Math.floor(Math.random()*songlist.length);
  if (songindex == songlist.length) {songindex = 0;}
  if (songindex == -1) {songindex = songlist.length-1;}
  mp3src.src = songlist[songindex][2];
  mp3audio.load();

  // update html after audio loads
  mp3audio.onloadedmetadata = function() {
    if (index != 0) { mp3audio.play(); }
    mp3audio.previousElementSibling.innerHTML = songlist[songindex][0];
    mp3audio.previousElementSibling.previousElementSibling.innerHTML = songlist[songindex][1];
    mp3audio.parentElement.lastElementChild.innerHTML = (songindex+1)+"/"+(songlist.length);
    progbar.nextElementSibling.innerHTML = numtotime(mp3audio.duration);
    progbarupdate();
  };
}
