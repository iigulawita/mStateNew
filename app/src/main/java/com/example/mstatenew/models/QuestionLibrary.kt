package com.example.mstatenew.models

import android.content.Context
import com.example.mstatenew.R

class QuestionLibrary {
    fun getPhq9Questions(context: Context): Array<QuestionItem> = arrayOf(
        QuestionItem(
            context.resources.getString(R.string._1),
            context.resources.getString(R.string._1_little_interest_or_pleasure_in_doing_things),
            context.resources.getString(R.string.not_at_all),
            context.resources.getString(R.string.several_days),
            context.resources.getString(R.string.more_than_half_the_days),
            context.resources.getString(R.string.nearly_every_day),
            -1,
            context.resources.getString(R.string.please_select_a_choice)
        ),
        QuestionItem(
            context.resources.getString(R.string._2),
            context.resources.getString(R.string._2_feeling_down_depressed_or_hopeless),
            context.resources.getString(R.string.not_at_all),
            context.resources.getString(R.string.several_days),
            context.resources.getString(R.string.more_than_half_the_days),
            context.resources.getString(R.string.nearly_every_day),
            -1,
            context.resources.getString(R.string.please_select_a_choice)
        ),
        QuestionItem(
            context.resources.getString(R.string._3),
            context.resources.getString(R.string._3_trouble_falling_or_staying_asleep_or_sleeping_too_much),
            context.resources.getString(R.string.not_at_all),
            context.resources.getString(R.string.several_days),
            context.resources.getString(R.string.more_than_half_the_days),
            context.resources.getString(R.string.nearly_every_day),
            -1,
            context.resources.getString(R.string.please_select_a_choice)
        ),
        QuestionItem(
            context.resources.getString(R.string._4),
            context.resources.getString(R.string._4_feeling_tired_or_having_little_energy),
            context.resources.getString(R.string.not_at_all),
            context.resources.getString(R.string.several_days),
            context.resources.getString(R.string.more_than_half_the_days),
            context.resources.getString(R.string.nearly_every_day),
            -1,
            context.resources.getString(R.string.please_select_a_choice)
        ),
        QuestionItem(
            context.resources.getString(R.string._5),
            context.resources.getString(R.string._5_poor_appetite_or_overeating),
            context.resources.getString(R.string.not_at_all),
            context.resources.getString(R.string.several_days),
            context.resources.getString(R.string.more_than_half_the_days),
            context.resources.getString(R.string.nearly_every_day),
            -1,
            context.resources.getString(R.string.please_select_a_choice)
        ),
        QuestionItem(
            context.resources.getString(R.string._6),
            context.resources.getString(R.string._6_feeling_bad_about_yourself_or_that_you_are_a_failure_or_have_let_yourself_or_your_family_down),
            context.resources.getString(R.string.not_at_all),
            context.resources.getString(R.string.several_days),
            context.resources.getString(R.string.more_than_half_the_days),
            context.resources.getString(R.string.nearly_every_day),
            -1,
            context.resources.getString(R.string.please_select_a_choice)
        ),
        QuestionItem(
            context.resources.getString(R.string._7),
            context.resources.getString(R.string._7_trouble_concentrating_on_things_such_as_reading_the_newspaper_or_watching_television),
            context.resources.getString(R.string.not_at_all),
            context.resources.getString(R.string.several_days),
            context.resources.getString(R.string.more_than_half_the_days),
            context.resources.getString(R.string.nearly_every_day),
            -1,
            context.resources.getString(R.string.please_select_a_choice)
        ),
        QuestionItem(
            context.resources.getString(R.string._8),
            context.resources.getString(R.string._8_moving_or_speaking_so_slowly_that_other_people_could_have_noticed_or_the_opposite_being_so_figety_or_restless_that_you_have_been_moving_around_a_lot_more_than_usual),
            context.resources.getString(R.string.not_at_all),
            context.resources.getString(R.string.several_days),
            context.resources.getString(R.string.more_than_half_the_days),
            context.resources.getString(R.string.nearly_every_day),
            -1,
            context.resources.getString(R.string.please_select_a_choice)
        ),
        QuestionItem(
            context.resources.getString(R.string._9),
            context.resources.getString(R.string._9_thoughts_that_you_would_be_better_off_dead_or_of_hurting_yourself),
            context.resources.getString(R.string.not_at_all),
            context.resources.getString(R.string.several_days),
            context.resources.getString(R.string.more_than_half_the_days),
            context.resources.getString(R.string.nearly_every_day),
            -1,
            context.resources.getString(R.string.please_select_a_choice)
        ),
    )

    fun getEpdsQuestions(context: Context): Array<QuestionItem> = arrayOf(
        QuestionItem(
            context.resources.getString(R.string._1),
            context.resources.getString(R.string._1_i_have_been_able_to_laugh_and_see_the_funny_side_of_things),
            context.resources.getString(R.string.as_much_as_i_always_could),
            context.resources.getString(R.string.not_quite_so_much_now),
            context.resources.getString(R.string.definitely_not_so_much_now),
            context.resources.getString(R.string.not_at_all),
            -1,
            context.resources.getString(R.string.please_select_a_choice)
        ),
        QuestionItem(
            context.resources.getString(R.string._2),
            context.resources.getString(R.string._2_feeling_down_depressed_or_hopeless),
            context.resources.getString(R.string.as_much_as_i_ever_did),
            context.resources.getString(R.string.rather_less_than_i_used_to),
            context.resources.getString(R.string.definitely_less_than_i_used_to),
            context.resources.getString(R.string.hardly_at_all),
            -1,
            context.resources.getString(R.string.please_select_a_choice)
        ),
        QuestionItem(
            context.resources.getString(R.string._3),
            context.resources.getString(R.string._3_i_have_blamed_myself_unnecessarily_when_things_went_wrong),
            context.resources.getString(R.string.yes_most_of_the_time),
            context.resources.getString(R.string.yes_some_of_the_time),
            context.resources.getString(R.string.not_very_often),
            context.resources.getString(R.string.no_never),
            -1,
            context.resources.getString(R.string.please_select_a_choice)
        ),
        QuestionItem(
            context.resources.getString(R.string._4),
            context.resources.getString(R.string._4_i_have_been_anxious_or_worried_for_no_good_reason),
            context.resources.getString(R.string.not_at_all),
            context.resources.getString(R.string.hardly_ever),
            context.resources.getString(R.string.yes_sometimes),
            context.resources.getString(R.string.yes_very_often),
            -1,
            context.resources.getString(R.string.please_select_a_choice)
        ),
        QuestionItem(
            context.resources.getString(R.string._5),
            context.resources.getString(R.string._5_i_have_felt_scared_or_panicky_for_no_very_good_reason),
            context.resources.getString(R.string.yes_quite_a_lot),
            context.resources.getString(R.string.yes_sometimes),
            context.resources.getString(R.string.no_not_much),
            context.resources.getString(R.string.no_not_at_all),
            -1,
            context.resources.getString(R.string.please_select_a_choice)
        ),
        QuestionItem(
            context.resources.getString(R.string._6),
            context.resources.getString(R.string._6_things_have_been_getting_on_top_of_me),
            context.resources.getString(R.string.yes_most_of_the_time_i_haven_t_been_able_to_cope_at_all),
            context.resources.getString(R.string.yes_sometimes_i_haven_t_been_coping_as_well_as_usual),
            context.resources.getString(R.string.no_most_of_the_time_i_have_coped_quite_well),
            context.resources.getString(R.string.no_i_have_been_coping_as_well_as_ever),
            -1,
            context.resources.getString(R.string.please_select_a_choice)
        ),
        QuestionItem(
            context.resources.getString(R.string._7),
            context.resources.getString(R.string._7i_have_been_so_unhappy_that_i_have_had_difficulty_sleeping),
            context.resources.getString(R.string.yes_most_of_the_time),
            context.resources.getString(R.string.yes_sometimes),
            context.resources.getString(R.string.not_very_often),
            context.resources.getString(R.string.no_not_at_all),
            -1,
            context.resources.getString(R.string.please_select_a_choice)
        ),
        QuestionItem(
            context.resources.getString(R.string._8),
            context.resources.getString(R.string._8_i_have_felt_sad_or_miserable),
            context.resources.getString(R.string.yes_most_of_the_time),
            context.resources.getString(R.string.yes_quite_often),
            context.resources.getString(R.string.not_very_often),
            context.resources.getString(R.string.no_not_at_all),
            -1,
            context.resources.getString(R.string.please_select_a_choice)
        ),
        QuestionItem(
            context.resources.getString(R.string._9),
            context.resources.getString(R.string._9_i_have_been_so_unhappy_that_i_have_been_crying),
            context.resources.getString(R.string.yes_most_of_the_time),
            context.resources.getString(R.string.yes_quite_often),
            context.resources.getString(R.string.only_occasionally),
            context.resources.getString(R.string.no_never),
            -1,
            context.resources.getString(R.string.please_select_a_choice)
        ),
        QuestionItem(
            context.resources.getString(R.string._10),
            context.resources.getString(R.string._10_the_thought_of_harming_myself_has_occurred_to_me),
            context.resources.getString(R.string.yes_quite_often),
            context.resources.getString(R.string.sometimes),
            context.resources.getString(R.string.hardly_ever),
            context.resources.getString(R.string.never),
            -1,
            context.resources.getString(R.string.please_select_a_choice)
        )
    )

}