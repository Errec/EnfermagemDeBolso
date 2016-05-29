package com.errec.android.enfermagemdebolso;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class Quiz extends AppCompatActivity {

    private List<Question> myQuestion = new ArrayList<Question>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        populateQuestionList();
        populateView();
    }

    private void populateQuestionList() {

        String questionHeader0 = "0AOCP - 2011 - Pref. Lagarto/SE";
        String questionBody0 = "0A Hipertensão Arterial Sistêmica (HAS) é a mais frequente das doenças cardiovasculares. É também o principal fator de risco para as complicações mais comuns como acidente vascular cerebral e infarto agudo do miocárdio, além da doença renal crônica terminal. Nesse contexto, assinale a alternativa correta";
        String itemA0 = "0Por ser na maior parte do seu curso sintomática, seu diagnóstico e tratamento é frequentemente feito no início da doença. Este fator determina que o controle da HAS e a adesão ao tratamento medicamentoso sejam considerados eficazes" ;
        String itemB0 = "0Apesar das modificações de estilo de vida serem de fundamental importância na prevenção da hipertensão arterial, estes não interferem no processo terapêutico que deve ser instituído com tratamento farmacológico adequado.";
        String itemC0 = "0Hipertensão Arterial é definida como pressão arterial sistólica maior ou igual a 160 mmHg e uma pressão arterial diastólica maior ou igual a 100 mmHg, em indivíduos que não estão fazendo uso de medicação anti-hipertensiva.";
        String itemD0 = "0A hipertensão arterial essencial é aquela com causa bem definida como a endócrina (acromegalia, hipotireoidismo, hipertireoidismo, hiperparatireoidismo, hiperaldosteronismo primário, síndrome Cushing, hiperplasia adrenal, feocromocitoma, uso de hormônios exógenos).";
        String itemE0 = "0A posição recomendada para a medida da pressão arterial (PA) é a sentada. Entretanto, a medida da PA na posição ortostática deve ser feita pelo menos na primeira avaliação, especialmente em idosos, diabéticos, alcoólicos e pacientes em uso de medicação anti-hipertensiva.";
        String answer0 = itemB0;

        String questionHeader1 = "1AOCP - 2011 - Pref. Lagarto/SE";
        String questionBody1 = "1A Hipertensão Arterial Sistêmica (HAS) é a mais frequente das doenças cardiovasculares. É também o principal fator de risco para as complicações mais comuns como acidente vascular cerebral e infarto agudo do miocárdio, além da doença renal crônica terminal. Nesse contexto, assinale a alternativa correta";
        String itemA1 = "1Por ser na maior parte do seu curso sintomática, seu diagnóstico e tratamento é frequentemente feito no início da doença. Este fator determina que o controle da HAS e a adesão ao tratamento medicamentoso sejam considerados eficazes" ;
        String itemB1 = "1Apesar das modificações de estilo de vida serem de fundamental importância na prevenção da hipertensão arterial, estes não interferem no processo terapêutico que deve ser instituído com tratamento farmacológico adequado.";
        String itemC1 = "1Hipertensão Arterial é definida como pressão arterial sistólica maior ou igual a 160 mmHg e uma pressão arterial diastólica maior ou igual a 100 mmHg, em indivíduos que não estão fazendo uso de medicação anti-hipertensiva.";
        String itemD1 = "1A hipertensão arterial essencial é aquela com causa bem definida como a endócrina (acromegalia, hipotireoidismo, hipertireoidismo, hiperparatireoidismo, hiperaldosteronismo primário, síndrome Cushing, hiperplasia adrenal, feocromocitoma, uso de hormônios exógenos).";
        String itemE1 = "1A posição recomendada para a medida da pressão arterial (PA) é a sentada. Entretanto, a medida da PA na posição ortostática deve ser feita pelo menos na primeira avaliação, especialmente em idosos, diabéticos, alcoólicos e pacientes em uso de medicação anti-hipertensiva.";
        String answer1 = itemB1;

        String questionHeader2 = "2AOCP - 2011 - Pref. Lagarto/SE";
        String questionBody2 = "2A Hipertensão Arterial Sistêmica (HAS) é a mais frequente das doenças cardiovasculares. É também o principal fator de risco para as complicações mais comuns como acidente vascular cerebral e infarto agudo do miocárdio, além da doença renal crônica terminal. Nesse contexto, assinale a alternativa correta";
        String itemA2 = "2Por ser na maior parte do seu curso sintomática, seu diagnóstico e tratamento é frequentemente feito no início da doença. Este fator determina que o controle da HAS e a adesão ao tratamento medicamentoso sejam considerados eficazes" ;
        String itemB2 = "2Apesar das modificações de estilo de vida serem de fundamental importância na prevenção da hipertensão arterial, estes não interferem no processo terapêutico que deve ser instituído com tratamento farmacológico adequado.";
        String itemC2 = "2Hipertensão Arterial é definida como pressão arterial sistólica maior ou igual a 160 mmHg e uma pressão arterial diastólica maior ou igual a 100 mmHg, em indivíduos que não estão fazendo uso de medicação anti-hipertensiva.";
        String itemD2 = "2A hipertensão arterial essencial é aquela com causa bem definida como a endócrina (acromegalia, hipotireoidismo, hipertireoidismo, hiperparatireoidismo, hiperaldosteronismo primário, síndrome Cushing, hiperplasia adrenal, feocromocitoma, uso de hormônios exógenos).";
        String itemE2 = "2A posição recomendada para a medida da pressão arterial (PA) é a sentada. Entretanto, a medida da PA na posição ortostática deve ser feita pelo menos na primeira avaliação, especialmente em idosos, diabéticos, alcoólicos e pacientes em uso de medicação anti-hipertensiva.";
        String answer2 = itemB2;

        myQuestion.add(new Question(questionHeader0, questionBody0, itemA0, itemB0, itemC0, itemD0, itemE0, answer0));
        myQuestion.add(new Question(questionHeader1, questionBody1, itemA1, itemB1, itemC1, itemD1, itemE1, answer1));
        myQuestion.add(new Question(questionHeader2, questionBody2, itemA2, itemB2, itemC2, itemD2, itemE2, answer2));
    }

    private void populateView(){

        //TODO

    }

}