const width = 200;
const height = 200;

setDocDimensions(width, height);

const f = new bt.Turtle();

function listdraw(list) {
  for (let i=0; i<(list.length); i++) {
    let [code,xval,yval] = list[i];
    switch (code) {
      case 1:
        f.step([xval,yval]);
        break;
      case 2:
        f.right(xval/2);
        f.arc(xval,yval);
        f.setAngle(0);
        break;
      case 3:
        f.right(xval);
        break;
    }
  }
}
function jumpmovedraw(coords, draw) {
  f.up();
  f.step(coords);
  f.down();
  listdraw(draw);
}
const head = [
  [1,-12,8],
  [1,-6,14],
  [1,0,25],
  [1,6,14],
  [1,12,8],
  [2,-27,105],
  [2,-27,-105],
  [2,-27,105],
  [1,12,-8],
  [1,6,-14],
  [1,0,-25],
  [1,-6,-14],
  [1,-12,-8],
  [2,-27,-105]
];
const body = [
  [1,-7,-10],
  [1,0,-30],
  [1,11,-25],
  [2,37,185],
  [1,10,32],
  [1,-7,34],
  [1,-19,18],
  [1,-33,2],
  [1,2,7],
  [1,6,5],
  [3,8],
  [2,-22,76],
  [3,8],
  [2,-22,-76],
  [3,8],
  [2,-22,76],
  [1,4,-7],
  [1,0,-9]
];
const rarm = [
  [3,80],
  [2,72,15],
  [2,26,60],
  [3,-69],
  [2,81,13],
  [3,9],
  [2,-36,-45],
  [3,-23],
  [2,-29,-42],
  [3,-22],
  [2,121,12]
]
const leg = [
  [3,-30],
  [2,78,14],
  [1,2,36],
  [3,219],
  [2,88,15],
]
const rear = [
  [1,13,-5],
  [1,24,-2],
  [1,8,25],
  [1,-13,5],
  [1,-32,-23],
  [1,13,-5],
  [1,32,23]
]
const lear = [
  [1,14,-2],
  [1,23,0],
  [1,7,25],
  [1,-30,-25],
  [1,-14,2],
  [1,30,25],
  [1,14,-2]
]
const leye = [
  [3,-23],
  [2,111,1.5],
  [3,-121],
  [2,56,10],
  [3,155],
  [2,111,1.5],
  [3,59],
  [2,56,10]
]
const reye = [
  [3,33],
  [2,-111,-1.5],
  [3,131],
  [2,-56,-10],
  [3,-145],
  [2,-111,-1.5],
  [3,-49],
  [2,-56,-10]
]
const mouth = [
  [3,24],
  [2,21,16],
  [3,-6],
  [2,21,66],
  [3,44],
  [2,-83,3],
  [3,24],
  [2,74,3],
  [3,-20],
  [2,18,19],
]
f.jump([50,100]);
listdraw(head);
jumpmovedraw([-5,3],body);
// left arm
f.up();
f.step([-113,-69]);
f.down();
f.right(119);
f.arc(160,10);
// right arm
jumpmovedraw([51,-4],rarm);
//leg
jumpmovedraw([38,5],leg);
//right ear
jumpmovedraw([-86,66],rear);
//left ear
jumpmovedraw([-86,-16],lear);
//left eye
jumpmovedraw([-32,-59],leye);
//right eye
jumpmovedraw([16,-.5],reye);
//mouth
jumpmovedraw([-28,-19],mouth);

drawLines(f.lines());
