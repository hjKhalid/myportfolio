let a;
let date;
let time;
setInterval(() => {
    a = new Date();
    date = a.tolocaleDateString();
    a.getHours();
    a.getMinutes();
    a.getSeconds();
    time = a.getHours + ":" + a.getMinutes + ":" + a.getSeconds
    console.log(time)
    document.getElementById('time').innerHTML = time + "on" + date
},1000);