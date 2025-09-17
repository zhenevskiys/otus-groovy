package com.example

static void main(String[] args) {
    def atm = new ATMZ()

// Пополнение (внесение купюр)
    atm.deposit(5000, 2)  // 2 x 5000
// atm.deposit(250, 3)  // 3 x 2000 - проверяю отработку ошибки
//atm.deposit(1000, 0)  // - проверяю отработку ошибки
    atm.deposit(500,  4)  // 4 x  500
    atm.deposit(100, 10)  // 10 x 100

    println "Баланс: ${atm.balance()} рублей"  // проверим сумму

    atm.withdraw(300)
}