package com.example

// назвал ATMZ потому что ругался на название, я не понял из-за чего
class ATMZ {
    // Список номиналов банкнот
    List<Integer> typesOfBanknotes = [5000, 1000, 500, 200, 100, 50, 10]

    // хранилище банкомата - map номинал_банкноты -> количество
    Map<Integer, Integer> store = typesOfBanknotes.collectEntries {[(it): 0]}

    // внести купюры одного номинала, количество купюр
    def deposit(Integer typeOfBanknotes, Integer count){
        if (!typesOfBanknotes.contains(typeOfBanknotes)) throw new Exception("Таких купюр нет: $typeOfBanknotes")
        if (count <= 0) throw new Exception("Купюр должно быть больше 0")
        store[typeOfBanknotes] = store[typeOfBanknotes] + count
        println "внесли банкноты номиналом $typeOfBanknotes $count штук"
    }

    // суммируем все купюры что есть в хранилище
    def balance(){
        int total = 0
        store.each { typeOfBanknotes, count ->
            total += typeOfBanknotes * count
        }
        return total
    }

    // выдавать запрошенную сумму минимальным количеством банкнот или ошибку, если сумму нельзя выдать.
    def withdraw(Integer amount){
        if (balance() < amount) throw new Exception("Баланс меньше требуемой суммы")
        //TODO релизация логики выдачи банкнот - пока мне сложно, использую заглушку
        println "Выдано ${amount} рублей"
        //TODO я должен выданные банкноты убрать из хранилища и выдать новый баланс
        println "Баланс после выдачи ${balance() - amount} рублей"
    }
}

