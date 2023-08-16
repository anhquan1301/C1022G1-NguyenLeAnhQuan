// Bai 1

// let doC = 20;

// let doF = doC * 9 / 5 + 32;

// console.log(doF);

// Bai 2

// let m = 10.5;

// let feet = m * 3.2808;

// console.log(feet);

// Bai 3

// let a = 5;

// let s = a * a;

// console.log(s);


// Bai 4

// let a = 5;

// let b = 10;

// let s = a * b;

// console.log(s);


// bai 5
// let a = 20;

// let b = 10;

// let s = (a * b) / 2
// console.log(s);

// Bai 6

// let a = 10;

// let b = 5;

// let x;

// ax + b = 0
// if (a != 0) {
//     x = (-b) / a;
// } else {
//     console.log("PT vô nghiệm");
// }

// bai 7
// let a = 5
// let b = -2
// let c = 3
// let delta = Math.pow(b, 2) - 4 * a * c
// let x = (-b) / (2 * a)
// let x1 = (-b + Math.sqrt(delta)) / 2 * a
// let x2 = (-b - Math.sqrt(delta)) / 2 * a
// if (delta > 0 && a != 0) {
//     console.log('Nghiệm thứ nhất: ' + x1 + '<br>');
//     console.log('Nghiệm thứ hai: ' + x2);
// }
// else if (delta == 0 && a != 0) {
//     console.log('Có nghiệm kép x1 = x2: ' + x)
// }
// else {
//     console.log('PT vô nghiệm')
// }

// Bai 8

// let inputAge = 8;

// if (typeof inputAge !== "number" || inputAge % 1 !== 0 || inputAge < 0 || inputAge > 120) {
//     console.log("Số tuổi phải là số nguyên, lớn hơn 0 và bé hơn 120")
// } else {
//     console.log("Số tuổi của 1 người")
// }


// Bai 9

// let a = 2
// let b = 3
// let c = 4

// let d = a > 0 && b > 0 && c > 0;

// let canhab = a + b;
// let canhbc = b + c;
// let canhac = a + c;

// (canhab > c && canhbc > a && canhac > b && d) ? console.log("Là cạnh của tạm giác") : console.log("Không phải là cạnh của tam giác")   


// Bai 10

// let kWh = 400;

// let tienDien;

// if (kWh >= 401) {
//     tienDien = kWh * 2927
//     console.log("tiền điện tháng này: " + tienDien + "VND")
// }
// else if (kWh >= 301) {
//     tienDien = kWh * 2834
//     console.log("tiền điện tháng này: " + tienDien + "VND")
// }
// else if (kWh >= 201) {
//     tienDien = kWh * 2536
//     console.log("tiền điện tháng này: " + tienDien + "VND")
// }
// else if (kWh >= 101) {
//     tienDien = kWh * 2014
//     console.log("tiền điện tháng này: " + tienDien + "VND")
// }
// else if (kWh >= 51) {
//     tienDien = kWh * 1734
//     console.log("tiền điện tháng này: " + tienDien + "VND")
// }
// else {
//     tienDien = kWh * 1678
//     console.log("tiền điện tháng này: " + tienDien + "VND")
// }

// Bai 11

// let thuNhap = 10000000;
// let thueCaNhan;
// if (thuNhap > 30000000) {
//     thueCaNhan = thuNhap * 25 / 100
//     console.log(thueCaNhan + "VND")
// }
// else if (thuNhap > 20000000) {
//     thueCaNhan = thuNhap * 20 / 100
//     console.log(thueCaNhan + "VND")
// }
// else if (thuNhap > 10000000) {
//     thueCaNhan = thuNhap * 15 / 100
//     console.log(thueCaNhan + "VND")
// }
// else if (thuNhap > 5000000) {
//     thueCaNhan = thuNhap * 10 / 100
//     console.log(thueCaNhan + "VND")
// }
// else {
//     thueCaNhan = thuNhap * 5 / 100 - 0
//     console.log(thueCaNhan + "VND")
// }

// Bai 12
// let tienBanDau = 5000000
// let laiSuatHangThang = 200000
// let soThang = 6
// let ketQua = tienBanDau * laiSuatHangThang * soThang / 12 * soThang

// console.log("Số tiền lãi: " + ketQua);