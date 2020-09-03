package com.sakaicompany.MimicMonster1_01;

import android.content.Context;
import android.graphics.Typeface;

import androidx.core.content.res.ResourcesCompat;

import java.util.ArrayList;
import java.util.List;

public class GlobalData {
    // API
    public static final String[] MENU = {
            "　初級１　ぷよ",
            "　初級２　ゴースト",
            "　初級３　一つ目",
            "　初級４　河童",
            "　初級５　小悪魔ひよこ　",
            "　初級６　マジカルパンプキン",
            "　中級１　ミイラ男",
            "　中級２　ナイト",
            "　中級３　ミノタウロス",
            "　上級１　ゴーレム",
            "　上級２　ゴーストアーマー",
            "　難　関　ドラゴン",
    };

    public static final String[] VIET_1 = {
            "Tôi là Carla.",
            "Carla, công việc của bạn là gì?",
            "Tôi là học sinh.",
            "Ông Kim có phải là giáo viên không?",
            "Không, ông ấy không phải là giáo viên.",
            "Tôi có thể nói tiếng Nhật ",
            "Noda có thể nói tiếng Pháp không?",
            "Carla có thể nói tiếng Nhật không?",
            "Vâng, tôi có thể nói một chút.",
            "Kim không biết nói tiếng Nhật.",
    };
    public static final String[] JAPA_1 = {
            "わたしは　カーラです。",
            "カーラさん、おしごとはなんですか。",
            "わたしは　がくせいです。",
            "キムさんは　せんせいですか。",
            "いいえ、せんせいじゃないです。",
            "わたしは　にほんごが　できます。",
            "のださんは　フランスご　ができますか。",
            "カーラさんは　にほんごが　できますか。",
            "はい、すこしできます。",
            "キムさんは　にほんごが　できません。",
    };

    public static final String[] SOUND_1 = {
            "e01",
            "e02",
            "e03",
            "e04",
            "e05",
            "e06",
            "e07",
            "e08",
            "e09",
            "e10",
    };

    public static final String[] VIET_2 = {
            "Tôi cũng là một kỹ sư.",
            "Công việc của bạn là gì?",
            "Tôi không phải là kỹ sư.",
            "Tôi là một công chức.",
            "Tôi cũng là một công chức",
            "Gia đình tôi có bố, mẹ và tôi.",
            "Gia đình bạn bao nhiêu người?",
            "Gia đình của tôi 4 người",
            "Mẹ, vợ, tôi và con tôi",
            "Chồng, tôi và hai con",
    };
    public static final String[] JAPA_2 = {
            "わたしも　エンジニアです。",
            "おしごとは　なんですか。",
            "わたしは　エンジニアではないです。",
            "わたしは　こうむいんです。",
            "わたしも　こうむいんです。",
            "かぞくは　ちちと　ははと　わたしです。",
            "かぞくは　なんにんですか。",
            "わたしの　かぞくは　４にんです。",
            "つまと　ははと　わたしと　こどもです。",
            "おっとと　わたしと　こども　ふたりです。",
    };
    public static final String[] SOUND_2 = {
            "e11",
            "e12",
            "e13",
            "e14",
            "e15",
            "e16",
            "e17",
            "e18",
            "e19",
            "e20",
    };

    public static final String[] VIET_3 = {
            "Chị tôi đang sống ở Osaka",
            "Bạn đang sống ở đâu?",
            "Chúng tôi đang sống ở Hokkaido.",
            "Cậu bé này là ai thế?",
            "Con của anh trai tôi.",
            "Con của anh tôi 4 tuổi. ",
            "Bé gái này là ai thế?",
            "Con của chị tôi.",
            "Bạn bao nhiêu tuổi?",
            "Bạn bao nhiêu tuổi?",
    };
    public static final String[] JAPA_3 = {
            "あねは　おおさかに　すんでます。",
            "どこ　に　すんでいますか。",
            "わたしたちは　ほっかいどうに　すんでいます。",
            "この　おとこのこは　だれですか。",
            "あにの　こどもです。",
            "あにの　こどもは　４さいです。",
            "この　おんなのこは　だれですか。",
            "あねの　こどもです。",
            "なんさいですか。",
            "おいくつですか。",
    };

    public static final String[] SOUND_3 = {
            "e21",
            "e22",
            "e23",
            "e24",
            "e25",
            "e26",
            "e27",
            "e28",
            "e29",
            "e30",
    };

    public static final String[] VIET_4 = {
            "Tôi thích thịt.",
            "Bạn thích đồ ăn gì?",
            "Tôi cũng thích cá.",
            "Tôi thích thịt và rau.",
            "Shin-san thích cà phê.",
            "Tôi không thích rau.",
            "Yoshida không thích trà.",
            "Hose không thích bia.",
            "Tôi không thích thịt.",
            "Tôi cũng không thích cá.",
    };
    public static final String[] JAPA_4 = {
            "にくが　すきです。",
            "たべものは　なにが 　すきですか。",
            "さかなも　すきです。",
            "わたしは　にくと　やさいが　すきです。",
            "シンさんは　コーヒーが　すきです。",
            "やさいは　すきじゃないです。",
            "よしださんは　おちゃが　すきじゃないです。",
            "ホセさんは　ビールが　すきじゃないです。",
            "にくは　すきじゃないです。",
            "さかなも　すきじゃないです。",
    };

    public static final String[] SOUND_4 = {
            "e31",
            "e32",
            "e33",
            "e34",
            "e35",
            "e36",
            "e37",
            "e38",
            "e39",
            "e40",
    };

    public static final String[] VIET_5 = {
            "Tôi ăn sáng",
            "Bạn có luôn ăn sáng không",
            "Có, tôi có",
            "Tôi ăn bánh mì",
            "Trứng thì tôi không ăn",
            "Tôi thường uống cà phê",
            "Bạn thường ăn gì?",
            "Tôi thường ăn bánh mì và trái cây",
            "Tôi không hay ăn trứng lắm",
            "Tôi không hay uống nước ép lắm",
    };
    public static final String[] JAPA_5 = {
            "あさごはんを　たべます。",
            "いつも　あさごはんを　たべますか。",
            "はい、たべます。",
            "パンを　たべます。",
            "卵は　たべません。",
            "コーヒーをよくのみます。",
            "なにを　よく　たべますか。",
            "わたしは　パンと　くだものを　よく　たべます。",
            "たまごは　あまり　たべません。",
            "ジュースは　あまり　のみません。",
    };

    public static final String[] SOUND_5 = {
            "e41",
            "e42",
            "e43",
            "e44",
            "e45",
            "e46",
            "e47",
            "e48",
            "e49",
            "e50",
    };

    public static final String[] VIET_6 = {
            "Món ăn yêu thích là cà ri",
            "Bố tôi thích cơm và súp miso",
            "Bố cũng thích cả trà",
            "Bố không thích bánh mì lắm",
            "Món bố ghét là cá",
            "Tôi ăn ramen ở quán ramen",
            "Tôi ăn sushi ở quán sushi",
            "Hôm nay bạn ăn trưa ở đâu?",
            "Tôi ăn ở quán cà phê",
            "Bạn ăn gì?",
    };
    public static final String[] JAPA_6 = {
            "すきなりょうりは　カレーです。",
            "ちちは　ごはんと　みそしるが　すきです。",
            "こうちゃも　すきです。",
            "パンは　あまり　すきじゃないです。",
            "きらいなたべものは　さかなです。",
            "ラーメンやさんで　ラーメンを　たべます。",
            "おすしやさんで　おすしを　たべます。",
            "きょう　どこで　ひるごはんを　たべますか。",
            "コーヒーショップで　たべます。",
            "なにを　たべますか。",
    };

    public static final String[] SOUND_6 = {
            "e51",
            "e52",
            "e53",
            "e54",
            "e55",
            "e56",
            "e57",
            "e58",
            "e59",
            "e60",
    };

    public static GlobalStruct.testStruct q1_1() {
        GlobalStruct.testStruct info = new GlobalStruct.testStruct();

        info.imgQ = "q1_1";
        info.strQ = "ただしいことばを えらびなさい。";
        info.strA1 = " 1.がくせい";
        info.strA2 = " 2.きょうし";
        info.strA3 = " 3.かいしゃいん";
        info.collect = 2;

        return info;
    }

    public static GlobalStruct.testStruct q1_2() {
        GlobalStruct.testStruct info = new GlobalStruct.testStruct();

        info.imgQ = "q1_2";
        info.strQ = "ただしいことばを えらびなさい。";
        info.strA1 = " 1.きいてください";
        info.strA2 = " 2.かいてください";
        info.strA3 = " 3.よんでください";
        info.collect = 3;

        return info;
    }

    public static GlobalStruct.testStruct q1_3() {
        GlobalStruct.testStruct info = new GlobalStruct.testStruct();

        info.imgQ = "q1_3";
        info.strQ = "ただしいことばを えらびなさい。";
        info.strA1 = " 1.えいご";
        info.strA2 = " 2.にほんご";
        info.strA3 = " 3.フランスご";
        info.collect = 3;

        return info;
    }

    public static GlobalStruct.testStruct q1_4() {
        GlobalStruct.testStruct info = new GlobalStruct.testStruct();

        info.imgQ = "q1_4";
        info.strQ = "ただしいことばを えらびなさい。";
        info.strA1 = " 1.の";
        info.strA2 = " 2.は";
        info.strA3 = " 3.が";
        info.collect = 2;

        return info;
    }

    public static GlobalStruct.testStruct q1_5() {
        GlobalStruct.testStruct info = new GlobalStruct.testStruct();

        info.imgQ = "q1_5";
        info.strQ = "ただしいことばを えらびなさい。";
        info.strA1 = " 1.じゃないです";
        info.strA2 = " 2.できます";
        info.strA3 = " 3.できません";
        info.collect = 1;

        return info;
    }

    public static GlobalStruct.testStruct q2_1() {
        GlobalStruct.testStruct info = new GlobalStruct.testStruct();

        info.imgQ = "q2_1";
        info.strQ = "にほんごで　なんですか。";
        info.strA1 = " 1.エンジニア";
        info.strA2 = " 2.こうむいん";
        info.strA3 = " 3.しゅふ";
        info.collect = 1;

        return info;
    }

    public static GlobalStruct.testStruct q2_2() {
        GlobalStruct.testStruct info = new GlobalStruct.testStruct();

        info.imgQ = "q2_2";
        info.strQ = "かぞくは　なんにんですか。";
        info.strA1 = " 1.ふたり";
        info.strA2 = " 2.さんにん";
        info.strA3 = " 3.よにん";
        info.collect = 3;

        return info;
    }

    public static GlobalStruct.testStruct q2_3() {
        GlobalStruct.testStruct info = new GlobalStruct.testStruct();

        info.imgQ = "q2_3";
        info.strQ = "このひとは　だれですか。";
        info.strA1 = " 1.あに";
        info.strA2 = " 2.つま";
        info.strA3 = " 3.ともだち";
        info.collect = 2;

        return info;
    }

    public static GlobalStruct.testStruct q2_4() {
        GlobalStruct.testStruct info = new GlobalStruct.testStruct();

        info.imgQ = "q2_4";
        info.strQ = "どれが　ただしいですか";
        info.strA1 = " 1.かぞへ";
        info.strA2 = " 2.やぞく";
        info.strA3 = " 3.かぞく";
        info.collect = 3;

        return info;
    }

    public static GlobalStruct.testStruct q2_5() {
        GlobalStruct.testStruct info = new GlobalStruct.testStruct();

        info.imgQ = "q2_5";
        info.strQ = "（　）のことばを　えらびましょう。";
        info.strA1 = " 1.こども";
        info.strA2 = " 2.おっと";
        info.strA3 = " 3.あに";
        info.collect = 1;

        return info;
    }

    public static GlobalStruct.testStruct q3_1() {
        GlobalStruct.testStruct info = new GlobalStruct.testStruct();

        info.imgQ = "q3_1";
        info.strQ = "ここは　どこですか";
        info.strA1 = " 1.とうきょう";
        info.strA2 = " 2.おおさか";
        info.strA3 = " 3.ひろしま";
        info.collect = 3;

        return info;
    }

    public static GlobalStruct.testStruct q3_2() {
        GlobalStruct.testStruct info = new GlobalStruct.testStruct();

        info.imgQ = "q3_2";
        info.strQ = "（　　）に　ただしいことばを えらびなさい。";
        info.strA1 = " 1.の";
        info.strA2 = " 2.と";
        info.strA3 = " 3.に";
        info.collect = 1;

        return info;
    }

    public static GlobalStruct.testStruct q3_3() {
        GlobalStruct.testStruct info = new GlobalStruct.testStruct();

        info.imgQ = "q3_3";
        info.strQ = "（　　）に　ただしいことばを えらびなさい。";
        info.strA1 = " 1.はなし";
        info.strA2 = " 2.すん";
        info.strA3 = " 3.こたえ";
        info.collect = 2;

        return info;
    }

    public static GlobalStruct.testStruct q3_4() {
        GlobalStruct.testStruct info = new GlobalStruct.testStruct();

        info.imgQ = "q3_4";
        info.strQ = "ただしいことばを えらびなさい。";
        info.strA1 = " 1.きょうしです";
        info.strA2 = " 2.32さいです";
        info.strA3 = " 3.おおさかです";
        info.collect = 3;

        return info;
    }

    public static GlobalStruct.testStruct q3_5() {
        GlobalStruct.testStruct info = new GlobalStruct.testStruct();

        info.imgQ = "q3_5";
        info.strQ = "ただしいことばを えらびなさい。";
        info.strA1 = " 1.かわいいです";
        info.strA2 = " 2.あねです";
        info.strA3 = " 3.きょうとです";
        info.collect = 2;

        return info;
    }

    public static GlobalStruct.testStruct q4_1() {
        GlobalStruct.testStruct info = new GlobalStruct.testStruct();

        info.imgQ = "q4_1";
        info.strQ = "どれがただしいでしょうか";
        info.strA1 = " 1.①パン　②たまご　③ミルク";
        info.strA2 = " 2.①パン　②ごはん　③ジュース";
        info.strA3 = " 3.①ごはん　②さかな　③くだもの";
        info.collect = 3;

        return info;
    }

    public static GlobalStruct.testStruct q4_2() {
        GlobalStruct.testStruct info = new GlobalStruct.testStruct();

        info.imgQ = "q4_2";
        info.strQ = "かんじのよみは？";
        info.strA1 = " 1.さかな　と　たまご";
        info.strA2 = " 2.にく　と　たまご";
        info.strA3 = " 3.さかな　と　みず";
        info.collect = 1;

        return info;
    }

    public static GlobalStruct.testStruct q4_3() {
        GlobalStruct.testStruct info = new GlobalStruct.testStruct();

        info.imgQ = "q4_3";
        info.strQ = "ただしいものをえらびなさい。";
        info.strA1 = " 1.ごはんをのみます、コーヒーをのみます";
        info.strA2 = " 2.さかなをたべます、くだものをたべます";
        info.strA3 = " 3.パンをたべます、たまごをのみます";
        info.collect = 2;

        return info;
    }

    public static GlobalStruct.testStruct q4_4() {
        GlobalStruct.testStruct info = new GlobalStruct.testStruct();

        info.imgQ = "q4_4";
        info.strQ = "（　）に、ひらがな（は・が・も・と）をかきましょう";
        info.strA1 = " 1.①と ②も ③は";
        info.strA2 = " 2.①も ②は ③が";
        info.strA3 = " 3.①も ②も ③は";
        info.collect = 1;

        return info;
    }

    public static GlobalStruct.testStruct q4_5() {
        GlobalStruct.testStruct info = new GlobalStruct.testStruct();

        info.imgQ = "q4_5";
        info.strQ = "ただしいものをえらびなさい";
        info.strA1 = " 1.a a c";
        info.strA2 = " 2.c a c";
        info.strA3 = " 3.b a c";
        info.collect = 2;

        return info;
    }

    public static GlobalStruct.testStruct q5_1() {
        GlobalStruct.testStruct info = new GlobalStruct.testStruct();

        info.imgQ = "q5_1";
        info.strQ = "ただしいことばを えらびなさい。";
        info.strA1 = " 1.よく";
        info.strA2 = " 2.あまり";
        info.strA3 = " 3.いつも";
        info.collect = 1;

        return info;
    }

    public static GlobalStruct.testStruct q5_2() {
        GlobalStruct.testStruct info = new GlobalStruct.testStruct();

        info.imgQ = "q5_2";
        info.strQ = "ただしいことばを えらびなさい。";
        info.strA1 = " 1.よく";
        info.strA2 = " 2.いつも";
        info.strA3 = " 3.あまり";
        info.collect = 2;

        return info;
    }

    public static GlobalStruct.testStruct q5_3() {
        GlobalStruct.testStruct info = new GlobalStruct.testStruct();

        info.imgQ = "q5_3";
        info.strQ = "ただしいことばを えらびなさい。";
        info.strA1 = " 1.①も　　②あまり　③も";
        info.strA2 = " 2.①と　　②も　　　③あまり";
        info.strA3 = " 3.①と　　②よく　　③も";
        info.collect = 2;

        return info;
    }

    public static GlobalStruct.testStruct q5_4() {
        GlobalStruct.testStruct info = new GlobalStruct.testStruct();

        info.imgQ = "q5_4";
        info.strQ = "ただしいことばを えらびなさい。";
        info.strA1 = " 1.①たべます　② たべます　③のみます";
        info.strA2 = " 2.①のみます　②たべます　③のみます";
        info.strA3 = " 3.①たべます　②のみます　③たべます";
        info.collect = 3;

        return info;
    }

    public static GlobalStruct.testStruct q5_5() {
        GlobalStruct.testStruct info = new GlobalStruct.testStruct();

        info.imgQ = "q5_5";
        info.strQ = "ただしいことばを えらびなさい。";
        info.strA1 = " 1.① よく 　　②いつも";
        info.strA2 = " 2.①あまり　　②よく";
        info.strA3 = " 3.① いつも　　②あまり";
        info.collect = 3;

        return info;
    }

    public static GlobalStruct.testStruct q6_1() {
        GlobalStruct.testStruct info = new GlobalStruct.testStruct();

        info.imgQ = "q6_1";
        info.strQ = "ただしいことばを えらびなさい。";
        info.strA1 = " 1.①すし　②カレー　③うどん";
        info.strA2 = " 2.①カレー　②そば　③ピザ";
        info.strA3 = " 3.①カレー　②ラーメン　③うどん";
        info.collect = 3;

        return info;
    }

    public static GlobalStruct.testStruct q6_2() {
        GlobalStruct.testStruct info = new GlobalStruct.testStruct();

        info.imgQ = "q6_2";
        info.strQ = "ただしいことばを えらびなさい。";
        info.strA1 = " 1.①のみます　②のみます　③たべます";
        info.strA2 = " 2.①たべます　②たべます　③のみます";
        info.strA3 = " 3.①たべます　②のみます　③たべます";
        info.collect = 3;

        return info;
    }

    public static GlobalStruct.testStruct q6_3() {
        GlobalStruct.testStruct info = new GlobalStruct.testStruct();

        info.imgQ = "q6_3";
        info.strQ = "ただしいことばを えらびなさい。";
        info.strA1 = " 1.①すきな　②は　③こうちゃ　④です";
        info.strA2 = " 2.①こうちゃ　②は　③すきな　④です";
        info.strA3 = " 3.①すきな　②です　③こうちゃ　④は";
        info.collect = 1;

        return info;
    }

    public static GlobalStruct.testStruct q6_4() {
        GlobalStruct.testStruct info = new GlobalStruct.testStruct();

        info.imgQ = "q6_4";
        info.strQ = "ただしいことばを えらびなさい。";
        info.strA1 = " 1.①きらいな　②たべもの　③さかな　④です";
        info.strA2 = " 2.①さかな　②です　③きらいな　④たべもの";
        info.strA3 = " 3.①きらいな　②さかな　③たべもの　④です";
        info.collect = 1;

        return info;
    }

    public static GlobalStruct.testStruct q6_5() {
        GlobalStruct.testStruct info = new GlobalStruct.testStruct();

        info.imgQ = "q6_5";
        info.strQ = "ただしいことばを えらびなさい。";
        info.strA1 = " 1.①を　　②で　③で";
        info.strA2 = " 2.①で　　②で　③を";
        info.strA3 = " 3.①で　　②を　③で";
        info.collect = 2;

        return info;
    }
}
