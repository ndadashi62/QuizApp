package com.example.quizapp

object Constants {

    const val USER_NAME:String="user_name"
    const val TOTAL_QUESTIONS:String="total_question"
    const val CORRECT_ANSWERS:String="correct answer"



    fun getQuestions(): ArrayList<Question> {

        val questionList = ArrayList<Question>()

        val que1 = Question(
            1,
            "what country does this flag belong to?",
            R.drawable.ic_flag_of_iran,
            optionOne = "Iran",
            optionTwo = "Canada",
            optionThree = "England",
            optionFour = "Brazil",
            1
        )
        questionList.add(que1)



        val que2 = Question(
            2, "what country does this flag belong to?",
            R.drawable.ic_flag_of_france,
            optionOne = "Argantina",
            optionTwo = "France",
            optionThree = "Germany",
            optionFour = "Brazil",
            correctAnswer = 2
        )
        questionList.add(que2)

        val que3 = Question(
            3, "what country does this flag belong to?",
            R.drawable.ic_flag_of_canada,
            optionOne = "China",
            optionTwo = "Irland",
            optionThree = "Swiss",
            optionFour = "Canada",
            4
        )
        questionList.add(que3)

        val que4 = Question(
            5, "what country does this flag belong to?",
            R.drawable.ic_flag_of_brazil,
            optionOne = "Brazil",
            optionTwo = "canada",
            optionThree = "Oman",
            optionFour = "Germany",
            1
        )
        questionList.add(que4)

        val que6 = Question(
            6, "what country does this flag belong to?",
            R.drawable.ic_flag_of_england,
            optionOne = "Ghatar",
            optionTwo = "Pakistan",
            optionThree = "England",
            optionFour = "Italia",
            3
        )
        questionList.add(que6)

        val que7 = Question(
            7, "what country does this flag belong to?",
            R.drawable.ic_flag_of_usa,
            optionOne = "Iran",
            optionTwo = "Eygept",
            optionThree = "england",
            optionFour = "USA",
            4
        )
        questionList.add(que7)



        return  questionList


    }


}