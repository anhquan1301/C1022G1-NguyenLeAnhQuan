function BMI(){
    let weight = document.getElementById("weight").value;
    let height = document.getElementById("height").value;
    let bmi = weight / (height*height);
    let result = "";
    if(bmi<18)
    result = "Siêu gầy";
    else if(bmi<25)
    result = "Bình thường";
    else if(bmi<30)
    result = "Mũm mỉm";
    else
    result = "Béo phì";
    
    document.getElementById("result").innerHTML=result;
}