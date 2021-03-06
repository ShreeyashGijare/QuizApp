package com.example.quizapp

object Constants {

    const val USER_NAME : String = "User_name"
    const val TOTAL_QUES :String = "total_ques"
    const val CORRECT_ANSWER: String = "correct_answer"

    fun getQuestions(): ArrayList<Question>{
        val questionList = ArrayList<Question>()

        val que1 = Question(
            1,"What country does this flag belong to?",
            R.drawable.ic_flag_of_argentina,
            "Argentina","Australia",
            "USA","Austria",
            1
        )
        questionList.add(que1)

        val que2 = Question(
            2,"What country does this flag belong to?",
            R.drawable.ic_flag_of_australia,
            "Argentina","Australia",
            "USA","Austria",
            2
        )
        questionList.add(que2)

        val que3 = Question(
            3,"What country does this flag belong to?",
            R.drawable.ic_flag_of_belgium,
            "Belgium","Egypt",
            "UK","India",
            1
        )
        questionList.add(que3)

        val que4 = Question(
            4,"What country does this flag belong to?",
            R.drawable.ic_flag_of_brazil,
            "Belgium","India",
            "France","Brazil",
            4
        )
        questionList.add(que4)

        val que5 = Question(
            5,"What country does this flag belong to?",
            R.drawable.ic_flag_of_denmark,
            "UK","England",
            "Denmark","Pakistan",
            3
        )
        questionList.add(que5)

        val que6 = Question(
            6,"What country does this flag belong to?",
            R.drawable.ic_flag_of_fiji,
            "Italy","Fiji",
            "Mexico","Philipines",
            2
        )
        questionList.add(que6)

        val que7 = Question(
            7,"What country does this flag belong to?",
            R.drawable.ic_flag_of_germany,
            "India","Belgium",
            "Germany","Fiji",
            3
        )
        questionList.add(que7)

        val que8 = Question(
            8,"What country does this flag belong to?",
            R.drawable.ic_flag_of_india,
            "India","Belgium",
            "Sri Lanka","Thailand",
            1
        )
        questionList.add(que8)

        val que9 = Question(
            9,"What country does this flag belong to?",
            R.drawable.ic_flag_of_kuwait,
            "Afghanistan","Iraq",
            "Iran","Kuwait",
            4
        )
        questionList.add(que9)

        val que10 = Question(
            10,"What country does this flag belong to?",
            R.drawable.ic_flag_of_new_zealand,
            "New Zealand","Pakistan",
            "USA","Australia",
            1
        )
        questionList.add(que10)

        return questionList
    }

}