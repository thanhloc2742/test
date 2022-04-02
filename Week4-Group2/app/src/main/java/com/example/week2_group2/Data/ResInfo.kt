package com.example.week2_group2.Data



object ResInfo {
    var listOfRestaurant = mutableListOf<Info>(
        Info(33760,"Du Miên Garden Cafe - Phan Văn Trị", "7 Phan Văn Trị, P.10", "https://images.foody.vn/res/g4/33760/prof/s180x180/foody-mobile-du-mien-garden-mb-jp-309-635785114907746480.jpg"),
        Info(82801,"Hẻm Spaghetti - Nguyễn Oanh", "212/22 Nguyễn Oanh, P.17","https://images.foody.vn/res/g9/82801/prof/s180x180/foody-upload-api-foody-mobile-gi4-jpg-181001160804.jpg"),
        Info(194867, "Mì Cay Naga - 224 Phạm Văn Đồng", "224 Phạm Văn Đồng, P.1","https://images.foody.vn/res/g20/194867/prof/s180x180/foody-mobile-9zbk996o-jpg-112-636143635496125338.jpg"),
        Info(25656, "City House Cafe - Sân Vườn Lãng Mạn","21 Huỳnh Khương An, P. 5","https://images.foody.vn/res/g3/25656/prof/s180x180/foody-mobile-city-house-jpg-354-636133373358973749.jpg"),
        Info(66844,"Nhi Nhi Quán - Đặc Sản Phan Rang","125/48 Lê Đức Thọ, P. 17","https://images.foody.vn/res/g7/66844/prof/s180x180/foody-mobile-bpzy3ni3-jpg-841-636143721820688231.jpg"),
        Info(33645,"Yuri Yuri - Ẩm Thực Hàn Quốc","358 Nguyễn Văn Nghi, P. 7","https://images.foody.vn/res/g4/33645/prof/s180x180/foody-mobile-bayef6n3-jpg-308-636023635570133301.jpg"),
        Info(252442,"Trà Sữa Gong Cha - 貢茶 - Phan Văn Trị","595 Phan Văn Trị, P. 5","https://images.foody.vn/res/g26/252442/prof/s180x180/foody-mobile-12-jpg-323-636148043123028599.jpg"),
        Info(12513,"Oasis Cafe","26/14 Phạm Văn Đồng, P. 3","https://images.foody.vn/res/g2/12513/prof/s180x180/foody-mobile-oasis-cafe-tp-hcm.jpg"),
        Info(165239,"King BBQ Buffet Vincom Quang Trung","B1-11 Vincom Quang Trung, 190 Quang Trung","https://images.foody.vn/res/g8/73213/prof/s640x400/foody-upload-api-foody-mobile-foody-mobile-rqofoik-180623113654.jpg"),
        Info(70256,"Bánh Mì Cóc - Bánh Mì Gà Xé - 112A Nguyễn Thái Sơn","112A Nguyễn Thái Sơn, P. 3","https://images.foody.vn/res/g8/70256/prof/s180x180/foody-mobile-banh-mi-coc-mb-jpg-372-635745577757039316.jpg"),
        Info(87381,"Quán Nướng Ngói Sài Gòn","232 Phạm Văn Đồng, P. 1","https://images.foody.vn/res/g9/87381/prof/s640x400/foody-mobile-q1-jpg-336-635772345109157009.jpg"),
        Info(4861,"Bò Né Hai Chị Em - Quang Trung","460 Quang Trung, P. 10","https://images.foody.vn/res/g16/152670/prof/s640x400/foody-upload-api-foody-mobile-9-jpg-181220154729.jpg"),
        Info(228809,"Bánh Bông Lan Trứng Muối Sunny Bakery - Shop Online","1244/40/2B Lê Đức Thọ, P. 13","https://images.foody.vn/res/g21/204162/prof/s180x180/foody-mobile-c2-jpg-991-635882741531098219.jpg"),
        Info(93522,"Bún Đậu Mẹt 128","128 Phạm Văn Đồng, P. 3","https://images.foody.vn/res/g81/802969/prof/s180x180/foody-upload-api-foody-mobile-hmbb-jpg-181119105848.jpg"),
        Info(157840,"Quán Đồng Quê 2A - Quang Trung","16 Quang Trung, P. 11","https://images.foody.vn/res/g16/157840/prof/s180x180/foody-mobile-t-1-jpg-780-635744555065731054.jpg"),
        Info(141727,"YOLO Beer & Barbecue","543/1 Phan Văn Trị, P. 7","https://images.foody.vn/res/g15/141727/prof/s180x180/foody-mobile-yolo-beer-mb-jpg-434-635839609079023675.jpg"),
        Info(102771,"Cơm Tấm Loan - Nguyễn Thái Sơn","346 Nguyễn Thái Sơn","https://images.foody.vn/res/g11/102771/prof/s640x400/foody-mobile-mobile-jpg-273-636192952803833507.jpg"),
        Info(653237,"Bún Vịt Miến Gà - Ngon Nhất Quán","1271 Phan Văn Trị, P. 10","https://images.foody.vn/res/g66/653237/prof/s180x180/foody-mobile-hmbbd-jpg-457-636282993901178955.jpg"),
        Info(642375,"Feel Coffee & Tea Express - Nguyễn Văn Bảo","1 Nguyễn Văn Bảo","https://images.foody.vn/res/g65/642375/prof/s180x180/foody-mobile-hmb-jpg-405-636249971911506340.jpg"),
        Info(755920,"Hệ Thống Hàu 5K Sài Gòn - Lê Đức Thọ","265 Lê Đức Thọ, P. 17","https://images.foody.vn/res/g76/755920/prof/s180x180/foody-upload-api-foody-mobile-img_1373-jpg-180702154003.jpg")
    )

    fun addNewRes(name: String, address:String,link:String){
        val id = listOfRestaurant.size + 1
        listOfRestaurant.add(Info(id,name,address,link))

    }

    fun checkIsExist(name:String){
        //
    }
    fun getData(): List<Info>{
        return listOfRestaurant
    }
}


