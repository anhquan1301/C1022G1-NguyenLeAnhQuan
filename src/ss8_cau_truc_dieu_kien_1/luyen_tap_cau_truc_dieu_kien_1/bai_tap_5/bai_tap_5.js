function poin(){
    let point1 = +document.getElementById("point1").value;
    let point2 = +document.getElementById("point2").value;
    let point3 = +document.getElementById("point3").value;
    let result = (point1 + point2*2 + point3*3)/6;
        if (result >= 8)
            result = "Học sinh giỏi"
        else if (result >= 6.5)
            result = "Học sinh khá"
        else
            result = "Học sinh trung bình"
        
        document.getElementById("result").innerHTML=result;

}