function poin(){
    let poin1 = +document.getElementById("poin1").value;
    let poin2 = +document.getElementById("poin2").value;
    let poin3 = +document.getElementById("poin3").value;
    let result = (poin1 + poin2*2 + poin3*3)/6;
        if (result >= 8)
            result = "Học sinh giỏi"
        else if (result >= 6.5)
            result = "Học sinh khá"
        else
            result = "Học sinh trung bình"
        
        document.getElementById("result").innerHTML=result;

}