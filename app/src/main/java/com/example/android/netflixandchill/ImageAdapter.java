package com.example.android.netflixandchill;


import android.content.Context;
import android.widget.BaseAdapter;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;


    public class ImageAdapter extends BaseAdapter {



        private Context Context;

        public ImageAdapter(Context c){
            Context = c;
        }

        public int getCount() {
            return images.length;
        }

        public Object getItem(int position){
            return null;
        }

        public long getItemId(int position){
            return 0;
        }

        //creates a new ImageView for each item reference by the Adapter
        public View getView(int position, View convertView, ViewGroup parent){
            ImageView imageView;
            ArrayList<String> poster_paths = new ArrayList<String>
            for(int i = 0; i < json.length(); i++)
            {
                JSONobject obj = new JSONobject(json(i))
                        poster_paths.add("http://image.tmdb.org/t/p/w185"+obj.getString("poster_path"))


            }


            if (convertView == null){
                //if it's not recycled, initialize some attributes
                imageView = new ImageView(Context);
                //imageView.setLayoutParams(new GridView.LayoutParams(300,300));
                imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
                imageView.setPadding(0,0,0,0);
            }
            else{
                imageView = (ImageView) convertView;
            }
            imageView.setImageResource(Picasso.with(this).load(poster_paths.get(position).into(imageView)));
            return imageView;
        }


        JSONArray json = new JSONArray(
                {
                        "page": 1,
                "results": [{
            "adult": false,
                    "backdrop_path": "/dkMD5qlogeRMiEixC4YNPUvax2T.jpg",
                    "genre_ids": [28, 12, 878, 53],
            "id": 135397,
                    "original_language": "en",
                    "original_title": "Jurassic World",
                    "overview": "Twenty-two years after the events of Jurassic Park, Isla Nublar now features a fully functioning dinosaur theme park, Jurassic World, as originally envisioned by John Hammond.",
                    "release_date": "2015-06-12",
                    "poster_path": "/jjBgi2r5cRt36xF6iNUEhzscEcb.jpg",
                    "popularity": 50.019738,
                    "title": "Jurassic World",
                    "video": false,
                    "vote_average": 6.9,
                    "vote_count": 2843
        }, {
            "adult": false,
                    "backdrop_path": "/3Kgu3ys6W6UZWWFty7rlTWgST63.jpg",
                    "genre_ids": [28, 12, 878],
            "id": 166424,
                    "original_language": "en",
                    "original_title": "Fantastic Four",
                    "overview": "Four young outsiders teleport to a dangerous universe, which alters their physical form in shocking ways. Their lives irrevocably upended, the team must learn to harness their daunting new abilities and work together to save Earth from a former friend turned enemy.",
                    "release_date": "2015-08-07",
                    "poster_path": "/g23cs30dCMiG4ldaoVNP1ucjs6.jpg",
                    "popularity": 36.10629,
                    "title": "Fantastic Four",
                    "video": false,
                    "vote_average": 4.6,
                    "vote_count": 639
        }, {
            "adult": false,
                    "backdrop_path": "/sEgULSEnywgdSesVHFHpPAbOijl.jpg",
                    "genre_ids": [18, 12, 878],
            "id": 286217,
                    "original_language": "en",
                    "original_title": "The Martian",
                    "overview": "During a manned mission to Mars, Astronaut Mark Watney is presumed dead after a fierce storm and left behind by his crew. But Watney has survived and finds himself stranded and alone on the hostile planet. With only meager supplies, he must draw upon his ingenuity, wit and spirit to subsist and find a way to signal to Earth that he is alive.",
                    "release_date": "2015-10-02",
                    "poster_path": "/5aGhaIHYuQbqlHWvWYqMCnj40y2.jpg",
                    "popularity": 36.812344,
                    "title": "The Martian",
                    "video": false,
                    "vote_average": 7.7,
                    "vote_count": 843
        }, {
            "adult": false,
                    "backdrop_path": "/hQWYnnyHl3yEFp3jZrWoXfoXuQD.jpg",
                    "genre_ids": [10751, 16, 12, 35],
            "id": 211672,
                    "original_language": "en",
                    "original_title": "Minions",
                    "overview": "Minions Stuart, Kevin and Bob are recruited by Scarlet Overkill, a super-villain who, alongside her inventor husband Herb, hatches a plot to take over the world.",
                    "release_date": "2015-07-10",
                    "poster_path": "/q0R4crx2SehcEEQEkYObktdeFy.jpg",
                    "popularity": 29.368227,
                    "title": "Minions",
                    "video": false,
                    "vote_average": 6.9,
                    "vote_count": 1603
        }, {
            "adult": false,
                    "backdrop_path": "/vZMSji6u1Kfg5TcWWi4IAzfqXfC.jpg",
                    "genre_ids": [28, 12, 53],
            "id": 177677,
                    "original_language": "en",
                    "original_title": "Mission: Impossible – Rogue Nation",
                    "overview": "Ethan and team take on their most impossible mission yet, eradicating the Syndicate - an International rogue organization as highly skilled as they are, committed to destroying the IMF.",
                    "release_date": "2015-07-31",
                    "poster_path": "/z2sJd1OvAGZLxgjBdSnQoLCfn3M.jpg",
                    "popularity": 28.160613,
                    "title": "Mission: Impossible – Rogue Nation",
                    "video": false,
                    "vote_average": 7.2,
                    "vote_count": 1101
        }, {
            "adult": false,
                    "backdrop_path": "/bIlYH4l2AyYvEysmS2AOfjO7Dn8.jpg",
                    "genre_ids": [878, 28, 53, 12],
            "id": 87101,
                    "original_language": "en",
                    "original_title": "Terminator Genisys",
                    "overview": "The year is 2029. John Connor, leader of the resistance continues the war against the machines. At the Los Angeles offensive, John's fears of the unknown future begin to emerge when TECOM spies reveal a new plot by SkyNet that will attack him from both fronts; past and future, and will ultimately change warfare forever.",
                    "release_date": "2015-07-01",
                    "poster_path": "/5JU9ytZJyR3zmClGmVm9q4Geqbd.jpg",
                    "popularity": 27.430054,
                    "title": "Terminator Genisys",
                    "video": false,
                    "vote_average": 6.2,
                    "vote_count": 1253
        }, {
            "adult": false,
                    "backdrop_path": "/szytSpLAyBh3ULei3x663mAv5ZT.jpg",
                    "genre_ids": [35, 16, 10751],
            "id": 150540,
                    "original_language": "en",
                    "original_title": "Inside Out",
                    "overview": "Growing up can be a bumpy road, and it's no exception for Riley, who is uprooted from her Midwest life when her father starts a new job in San Francisco. Like all of us, Riley is guided by her emotions - Joy, Fear, Anger, Disgust and Sadness. The emotions live in Headquarters, the control center inside Riley's mind, where they help advise her through everyday life. As Riley and her emotions struggle to adjust to a new life in San Francisco, turmoil ensues in Headquarters. Although Joy, Riley's main and most important emotion, tries to keep things positive, the emotions conflict on how best to navigate a new city, house and school.",
                    "release_date": "2015-06-19",
                    "poster_path": "/aAmfIX3TT40zUHGcCKrlOZRKC7u.jpg",
                    "popularity": 23.615616,
                    "title": "Inside Out",
                    "video": false,
                    "vote_average": 8.1,
                    "vote_count": 1608
        }, {
            "adult": false,
                    "backdrop_path": "/tbhdm8UJAb4ViCTsulYFL3lxMCd.jpg",
                    "genre_ids": [53, 28, 12],
            "id": 76341,
                    "original_language": "en",
                    "original_title": "Mad Max: Fury Road",
                    "overview": "An apocalyptic story set in the furthest reaches of our planet, in a stark desert landscape where humanity is broken, and most everyone is crazed fighting for the necessities of life. Within this world exist two rebels on the run who just might be able to restore order. There's Max, a man of action and a man of few words, who seeks peace of mind following the loss of his wife and child in the aftermath of the chaos. And Furiosa, a woman of action and a woman who believes her path to survival may be achieved if she can make it across the desert back to her childhood homeland.",
                    "release_date": "2015-05-15",
                    "poster_path": "/kqjL17yufvn9OVLyXYpvtyrFfak.jpg",
                    "popularity": 19.287582,
                    "title": "Mad Max: Fury Road",
                    "video": false,
                    "vote_average": 7.6,
                    "vote_count": 2695
        }, {
            "adult": false,
                    "backdrop_path": "/fQbc5XuB4vWA9gnY1CmyxFaOufF.jpg",
                    "genre_ids": [14, 878, 9648, 28, 12],
            "id": 158852,
                    "original_language": "en",
                    "original_title": "Tomorrowland",
                    "overview": "Bound by a shared destiny, a bright, optimistic teen bursting with scientific curiosity and a former boy-genius inventor jaded by disillusionment embark on a danger-filled mission to unearth the secrets of an enigmatic place somewhere in time and space that exists in their collective memory as \"Tomorrowland.\"",
                    "release_date": "2015-05-22",
                    "poster_path": "/mGA8JtBKUs8HtdoiPad1FOlsLBi.jpg",
                    "popularity": 18.078505,
                    "title": "Tomorrowland",
                    "video": false,
                    "vote_average": 6.3,
                    "vote_count": 868
        }, {
            "adult": false,
                    "backdrop_path": "/kvXLZqY0Ngl1XSw7EaMQO0C1CCj.jpg",
                    "genre_ids": [35, 28, 12, 878],
            "id": 102899,
                    "original_language": "en",
                    "original_title": "Ant-Man",
                    "overview": "Armed with the astonishing ability to shrink in scale but increase in strength, con-man Scott Lang must embrace his inner-hero and help his mentor, Dr. Hank Pym, protect the secret behind his spectacular Ant-Man suit from a new generation of towering threats. Against seemingly insurmountable obstacles, Pym and Lang must plan and pull off a heist that will save the world.",
                    "release_date": "2015-07-17",
                    "poster_path": "/7SGGUiTE6oc2fh9MjIk5M00dsQd.jpg",
                    "popularity": 17.324185,
                    "title": "Ant-Man",
                    "video": false,
                    "vote_average": 7.0,
                    "vote_count": 1405
        }, {
            "adult": false,
                    "backdrop_path": "/nvZVu6inpwLHKqRXZhye3S4uqei.jpg",
                    "genre_ids": [28, 35, 878],
            "id": 257344,
                    "original_language": "en",
                    "original_title": "Pixels",
                    "overview": "Video game experts are recruited by the military to fight 1980s-era video game characters who've attacked New York.",
                    "release_date": "2015-07-24",
                    "poster_path": "/ktyVmIqfoaJ8w0gDSZyjhhOPpD6.jpg",
                    "popularity": 16.015451,
                    "title": "Pixels",
                    "video": false,
                    "vote_average": 6.1,
                    "vote_count": 619
        }, {
            "adult": false,
                    "backdrop_path": "/ioEozbN5RJouaIWTSe8zNHkC1yY.jpg",
                    "genre_ids": [28, 18, 53],
            "id": 254128,
                    "original_language": "en",
                    "original_title": "San Andreas",
                    "overview": "In the aftermath of a massive earthquake in California, a rescue-chopper pilot makes a dangerous journey across the state in order to rescue his estranged daughter.",
                    "release_date": "2015-05-29",
                    "poster_path": "/qey0tdcOp9kCDdEZuJ87yE3crSe.jpg",
                    "popularity": 15.686519,
                    "title": "San Andreas",
                    "video": false,
                    "vote_average": 6.2,
                    "vote_count": 1122
        }, {
            "adult": false,
                    "backdrop_path": "/xu9zaAevzQ5nnrsXN6JcahLnG4i.jpg",
                    "genre_ids": [18, 878],
            "id": 157336,
                    "original_language": "en",
                    "original_title": "Interstellar",
                    "overview": "Interstellar chronicles the adventures of a group of explorers who make use of a newly discovered wormhole to surpass the limitations on human space travel and conquer the vast distances involved in an interstellar voyage.",
                    "release_date": "2014-11-05",
                    "poster_path": "/nBNZadXqJSdt05SHLqgT0HuC5Gm.jpg",
                    "popularity": 15.20599,
                    "title": "Interstellar",
                    "video": false,
                    "vote_average": 8.3,
                    "vote_count": 3583
        }, {
            "adult": false,
                    "backdrop_path": "/qhH3GyIfAnGv1pjdV3mw03qAilg.jpg",
                    "genre_ids": [12, 14],
            "id": 122917,
                    "original_language": "en",
                    "original_title": "The Hobbit: The Battle of the Five Armies",
                    "overview": "Mere seconds after the events of Desolation, Bilbo and Company continue to claim a mountain of treasure that was guarded long ago: But with Gandalf the Grey also facing some formidable foes of his own, the Hobbit is outmatched when the brutal army of orcs led by Azog the Defiler returns. But with other armies such as the elves and the men of Lake-Town, which are unsure to be trusted, are put to the ultimate test when Smaug's wrath, Azog's sheer strength, and Sauron's force of complete ends attack. All in all, the trusted armies have two choices: unite or die. But even worse, Bilbo gets put on a knife edge and finds himself fighting with Hobbit warfare with all of his might for his dwarf-friends, as the hope for Middle-Earth is all put in Bilbo's hands. The one \"precious\" thing to end it all.",
                    "release_date": "2014-12-17",
                    "poster_path": "/l3Lb8UWmqfXY9kr9YhJXvnTvf4I.jpg",
                    "popularity": 13.861319,
                    "title": "The Hobbit: The Battle of the Five Armies",
                    "video": false,
                    "vote_average": 7.2,
                    "vote_count": 2056
        }, {
            "adult": false,
                    "backdrop_path": "/sJX97HsPAdeD5bzk9TppYFsbBUY.jpg",
                    "genre_ids": [35, 28, 12],
            "id": 203801,
                    "original_language": "en",
                    "original_title": "The Man from U.N.C.L.E.",
                    "overview": "At the height of the Cold War, a mysterious criminal organization plans to use nuclear weapons and technology to upset the fragile balance of power between the United States and Soviet Union. CIA agent Napoleon Solo and KGB agent Illya Kuryakin are forced to put aside their hostilities and work together to stop the evildoers in their tracks. The duo's only lead is the daughter of a missing German scientist, whom they must find soon to prevent a global catastrophe.",
                    "release_date": "2015-08-14",
                    "poster_path": "/5ttOaThDVmTpV8iragbrhdfxEep.jpg",
                    "popularity": 13.354719,
                    "title": "The Man from U.N.C.L.E.",
                    "video": false,
                    "vote_average": 6.9,
                    "vote_count": 391
        }, {
            "adult": false,
                    "backdrop_path": "/h3t4zZPteUPqyDBrmz5Z2zzGM61.jpg",
                    "genre_ids": [35, 16],
            "id": 159824,
                    "original_language": "en",
                    "original_title": "Hotel Transylvania 2",
                    "overview": "When the old-old-old-fashioned vampire Vlad arrives at the hotel for an impromptu family get-together, Hotel Transylvania is in for a collision of supernatural old-school and modern day cool.",
                    "release_date": "2015-09-25",
                    "poster_path": "/t4PLWexbe4wbNydCOBv18cYexup.jpg",
                    "popularity": 13.297671,
                    "title": "Hotel Transylvania 2",
                    "video": false,
                    "vote_average": 6.8,
                    "vote_count": 241
        }, {
            "adult": false,
                    "backdrop_path": "/yKY6Sqv7xLHkRGDnfC8fmHRX93i.jpg",
                    "genre_ids": [9648, 53, 878],
            "id": 238615,
                    "original_language": "en",
                    "original_title": "Self/less",
                    "overview": "An extremely wealthy elderly man dying from cancer undergoes a radical medical procedure that transfers his consciousness to the body of a healthy young man but everything may not be as good as it seems when he starts to uncover the mystery of the body's origins and the secret organization that will kill to keep its secrets.",
                    "release_date": "2015-07-10",
                    "poster_path": "/yf8DGTA7K4WAfMm5UwzPsvNKH9C.jpg",
                    "popularity": 12.886889,
                    "title": "Self/less",
                    "video": false,
                    "vote_average": 6.4,
                    "vote_count": 188
        }, {
            "adult": false,
                    "backdrop_path": "/570qhjGZmGPrBGnfx70jcwIuBr4.jpg",
                    "genre_ids": [878, 28, 12],
            "id": 99861,
                    "original_language": "en",
                    "original_title": "Avengers: Age of Ultron",
                    "overview": "When Tony Stark tries to jumpstart a dormant peacekeeping program, things go awry and Earth’s Mightiest Heroes are put to the ultimate test as the fate of the planet hangs in the balance. As the villainous Ultron emerges, it is up to The Avengers to stop him from enacting his terrible plans, and soon uneasy alliances and unexpected action pave the way for an epic and unique global adventure.",
                    "release_date": "2015-05-01",
                    "poster_path": "/t90Y3G8UGQp0f0DrP60wRu9gfrH.jpg",
                    "popularity": 12.791767,
                    "title": "Avengers: Age of Ultron",
                    "video": false,
                    "vote_average": 7.6,
                    "vote_count": 2629
        }, {
            "adult": false,
                    "backdrop_path": "/wVTYlkKPKrljJfugXN7UlLNjtuJ.jpg",
                    "genre_ids": [28, 12, 80],
            "id": 206647,
                    "original_language": "en",
                    "original_title": "Spectre",
                    "overview": "A cryptic message from Bond’s past sends him on a trail to uncover a sinister organization. While M battles political forces to keep the secret service alive, Bond peels back the layers of deceit to reveal the terrible truth behind SPECTRE.",
                    "release_date": "2015-11-06",
                    "poster_path": "/zHx5KaKaQdZZnEUgtjcIdNcB3ka.jpg",
                    "popularity": 12.464869,
                    "title": "Spectre",
                    "video": false,
                    "vote_average": 6.2,
                    "vote_count": 142
        }, {
            "adult": false,
                    "backdrop_path": "/2vFH3ntJbBC7QCwB0nRJGLx0oPU.jpg",
                    "genre_ids": [28, 18, 53],
            "id": 307081,
                    "original_language": "en",
                    "original_title": "Southpaw",
                    "overview": "Billy \"The Great\" Hope, the reigning junior middleweight boxing champion, has an impressive career, a loving wife and daughter, and a lavish lifestyle. However, when tragedy strikes, Billy hits rock bottom, losing his family, his house and his manager. He soon finds an unlikely savior in Tick Willis, a former fighter who trains the city's toughest amateur boxers. With his future on the line, Hope fights to reclaim the trust of those he loves the most.",
                    "release_date": "2015-07-24",
                    "poster_path": "/z3nGs7UED9XlqUkgWeT4jQ80m1N.jpg",
                    "popularity": 12.449529,
                    "title": "Southpaw",
                    "video": false,
                    "vote_average": 7.2,
                    "vote_count": 488
        }],
                "total_pages": 12444,
                "total_results": 248866
    }

        )

    }
