package com.example.week2_group2.Data




object UserInfo{

    var listOfUser = mutableListOf<User>(
        User(1,"Admin","Admin@gmail.com","Admin1234@password.com")
    )

    fun searchEmailInfo(oldemail: String): User { // EMAIL NHẬP TỪ TEXT
        var i = 0
        var trueEmail = User(null,null,null,null)
        listOfUser.forEach {
            val searchForUser = listOfUser.elementAt(i) // Lấy phần tử ở vị trí i ra
            val compareToUser = searchForUser.copy(email = oldemail) // Tạo bản sao phần tử ở vị trí i với email khác
            if(compareToUser == searchForUser){        // So sánh phần tử mới và cũ để xác định email là khác hay giống
                trueEmail = compareToUser // Nếu như giống nhau về email, lấy ra phần tử đó
            }
            i++ // Tịnh tiến để so sánh từng phần tử trong list
        }
        return trueEmail // Trả về phần tử có email chính xác, chính là account của người dùng
    }

    fun searchPassInfo(oldemail: String,oldpass : String): Boolean{

        val searchForPass = searchEmailInfo(oldemail) // Lấy ra phần tử có email trùng
        val compareToPass = searchForPass.copy(pass = oldpass) // Tạo bản sao với pass khác nhau
        return searchForPass == compareToPass // Trả về giá trị liệu chúng có bằng nhau
    }

    fun addNewUser(name:String,email:String,pass:String){
        val id = listOfUser.size + 1
        listOfUser.add(User(id,name,email,pass))

    }
    fun getData(): MutableList<User>{
        return listOfUser
    }
}



