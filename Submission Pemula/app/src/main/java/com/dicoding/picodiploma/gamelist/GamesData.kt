package com.dicoding.picodiploma.gamelist

import com.dicoding.picodiploma.gamelist.R.drawable

object GamesData {
    private val gameNames = arrayOf("The Legend of Zelda: Breath of the Wild",
        "Super Mario Odyssey",
        "Animal Crossing : New Horizons",
        "Mario Kart 8 Deluxe",
        "Fire Emblem: Three Houses",
        "Pokemon Sword and Shield",
        "Super Smash Bros. Ultimate",
        "Splatoon 2",
        "Luigi Mansion 3",
        "Octopath Traveler")

    private val gameDetails = arrayOf("Genre : RPG\nRelease Date : 2017\nAge Rating : 12\nThe Legend of Zelda: Breath of the Wild is a masterclass in open-world design and a watershed game that reinvents a 30-year-old franchise. It presents a wonderful sandbox full of mystery, dangling dozens upon dozens of tantalizing things in front of you that just beg to be explored. I’ve had so many adventures in Breath of the Wild, and each one has a unique story behind what led me to them, making them stories on top of stories. And even after I’ve spent more than 50 hours searching the far reaches of Hyrule, I still manage to come across things I haven’t seen before. I’ll easily spend 50 to 100 more trying to track down its fascinating moments.-IGN Review",
        "Genre : Action-adventure\nRelease Date : 2017\nAge Rating : E+10\nMario’s games have been around for almost as long as game consoles have been a thing, but thankfully, he’s always evolving. We rarely get the same Mario twice. Super Mario Odyssey delivers on that ongoing promise of originality and innovation: It distills the venerable series’ joyful, irreverent world and characters and best-in-class platforming action, and introduces a steady stream of new and unexpected mechanics. It’s all spun together into a generational masterpiece.-IGN Review",
        "Genre : Social simulation\nRelease Date : 2020\nAge Rating : 3\nThere are so many different types of Animal Crossing players, and yet Animal Crossing: New Horizons manages to improve upon the virtual lives of each player type that I can think of. For The Collector, there's a near-bottomless bounty of bugs, fish, and furniture to gather; for The Designer, there are new tools and few limits to what you can craft and customize. But it’s the The Artists, The Decorators, and The Dreamers who should be most excited: There's an entire island to jazz up, expanding the customizable area far beyond the walls of your house, which is all that previous Animal Crossing games allowed them to tinker with. Throw a swimming pool on the beach; add a giant kaiju statue to your garden; even literally move mountains. You can customize so much in New Horizons that it has me just as excited to see what people create as recent, lauded craft-'em-ups like Super Mario Maker 2 or Dreams.-IGN Review",
        "Genre : Racing\nRelease Date : 2017\nAge Rating : 3\nMario Kart 8 Deluxe is an amazing game for all the same reasons I mentioned in our original review. It's still a gorgeous kart racer and every bit as addictive as it was in 2014. This is the best entry in the series so far, and it has all the content you'll need.-IGN Review",
        "Genre : Tactical role-playing\nRelease Date : 2019\nAge Rating : Teen\nFire Emblem: Three Houses succeeds in its ambitious telling of a land at war helmed by captivating leaders, in which no side has all the answers. Its tense battles are made all the more harrowing thanks to new strategy elements, and the colorful cast of troops you send into the fray are incredibly charming.-IGN review",
        "Genre : Role-playing\nRelease Date : 2019\nAge Rating : 7+\nSword and Shield are extremely familiar and comfortable thanks to a pretty traditional setup: you pick one of three starter Pokemon and then head off across the Galar region to capture and train more, defeat eight unique and exciting gym challenges, and become a Pokemon master over the course of about 40 hours.-IGN Review",
        "Genre : Fighting\nRelease Date : 2018\nAge Rating : 12\nSuper Smash Bros. Ultimate lives up to its name, offering the most comprehensive game in the series to date. It has an absurd amount to play, fight, and unlock – though that can be to its detriment at times. While the World of Light adventure mode isn’t reason alone to get Smash Bros., it’s still a consistently amusing and shockingly large campaign, and a worthy compliment to Ultimate’s incredible multiplayer core. The Smash Bros. series has always maintained a wonderful balance of chaotic beat-em-up fun and tense fighting game action, and Super Smash Bros. Ultimate refines and improves on both sides of itself without abandoning either one.-IGN Review",
        "Genre : Third-person shooter\nRelease Date : 2017\nAge Rating : 12+\nThere’s a lot to love in Nintendo’s second iteration of its quirky shooter, especially the way Splatoon 2 emphasizes splatting the ground just as much as it does inking your opponents. The new additions to its single-player campaign and multiplayer modes are a step in the right direction, but it still has some work to do to make joining online games and voice chat less of a hassle. Still, with an addicting new Salmon Run co-op mode and the promise of free updates like the ones that helped the original Splatoon come into its own, I expect Splatoon 2 to keep me hooked.-IGN Review",
        "Genre : Action-adventure\nRelease Date : 2019\nAge Rating : 7\nMario, it turns out, isn’t the only plumber in Nintendo’s employ who can carry his own great game. Luigi’s Mansion 3 is so much fun, so charming, and so smartly designed that, moving forward, I really hope we get more than three of these games every 20 years. It’s absolutely the best Ghostbusters game ever made – it just happens to star Mario’s scaredy-cat brother rather than Peter Venkman and Ray Stantz.-IGN Review",
        "Genre : RPG\nRelease Date : 2018\nAge Rating : 12\nOctopath Traveler is a JRPG dream come true. Both its battle system and aesthetic pay loving tribute to the Super NES era while moving the formula forward in exciting and novel ways. This isn’t merely a modern retread of past classics, but a phenomenal homage with genuinely fresh ideas in a fantastically charming wrapper of old-school meets new. While the eight different character stories could’ve used a little more connection between them, I’m looking forward to going back to complete them all, explore the many side areas, battle optional bosses, and unlock the final job classes.-IGN Review")

    private val gamesImages = intArrayOf(
        drawable.botw,
        drawable.super_mario_odyssey,
        drawable.acnh,
        drawable.mario_kart,
        drawable.fire_emblem,
        drawable.pokemon_sword_and_shield,
        drawable.super_smash_bros,
        drawable.splatoon_2,
        drawable.luigis_mansion_3,
        drawable.octopath_traveler)

    private val gameTitles = arrayOf("The Legend of Zelda: Breath of the Wild",
            "Super Mario Odyssey",
            "Animal Crossing : New Horizons",
            "Mario Kart 8 Deluxe",
            "Fire Emblem: Three Houses",
            "Pokemon Sword and Shield",
            "Super Smash Bros. Ultimate",
            "Splatoon 2",
            "Luigi Mansion 3",
            "Octopath Traveler")

    private val gamePictures = intArrayOf(
            drawable.botw,
            drawable.super_mario_odyssey,
            drawable.acnh,
            drawable.mario_kart,
            drawable.fire_emblem,
            drawable.pokemon_sword_and_shield,
            drawable.super_smash_bros,
            drawable.splatoon_2,
            drawable.luigis_mansion_3,
            drawable.octopath_traveler)


    private val gameGenres = arrayOf("Genre :\nRPG",
            "Genre :\nAction\nadventure",
            "Genre :\nSocial\nsimulation",
            "Genre :\nRacing",
            "Genre :\nTactical\nrole-playing",
            "Genre :\nRole-playing",
            "Genre :\nFighting",
            "Genre :\nThird-person shooter",
            "Genre :\nAction-adventure",
            "Genre :\nRPG")

    private val gameReleases = arrayOf("Release Date :\n2017",
            "Release Date :\n2017",
            "Release Date :\n2020",
            "Release Date :\n2017",
            "Release Date :\n2019",
            "Release Date :\n2019",
            "Release Date :\n2018",
            "Release Date :\n2017",
            "Release Date :\n2019",
            "Release Date :\n2018")

    private val gameAges = arrayOf("Age Rating :\n12",
            "Age Rating :\nE+10",
            "Age Rating :\n3",
            "Age Rating :\n3",
            "Age Rating :\nTeen",
            "Age Rating :\n7+",
            "Age Rating :\n12",
            "Age Rating :\n12+",
            "Age Rating :\n7",
            "Age Rating :\n12")

    private val gameDescriptions = arrayOf("The Legend of Zelda: Breath of the Wild is a masterclass in open-world design and a watershed game that reinvents a 30-year-old franchise. It presents a wonderful sandbox full of mystery, dangling dozens upon dozens of tantalizing things in front of you that just beg to be explored. I’ve had so many adventures in Breath of the Wild, and each one has a unique story behind what led me to them, making them stories on top of stories. And even after I’ve spent more than 50 hours searching the far reaches of Hyrule, I still manage to come across things I haven’t seen before. I’ll easily spend 50 to 100 more trying to track down its fascinating moments.\n\n- IGN Review (Ign.com)",
            "Mario’s games have been around for almost as long as game consoles have been a thing, but thankfully, he’s always evolving. We rarely get the same Mario twice. Super Mario Odyssey delivers on that ongoing promise of originality and innovation: It distills the venerable series’ joyful, irreverent world and characters and best-in-class platforming action, and introduces a steady stream of new and unexpected mechanics. It’s all spun together into a generational masterpiece.\n\n- IGN Review (Ign.com)",
            "There are so many different types of Animal Crossing players, and yet Animal Crossing: New Horizons manages to improve upon the virtual lives of each player type that I can think of. For The Collector, there's a near-bottomless bounty of bugs, fish, and furniture to gather; for The Designer, there are new tools and few limits to what you can craft and customize. But it’s the The Artists, The Decorators, and The Dreamers who should be most excited: There's an entire island to jazz up, expanding the customizable area far beyond the walls of your house, which is all that previous Animal Crossing games allowed them to tinker with. Throw a swimming pool on the beach; add a giant kaiju statue to your garden; even literally move mountains. You can customize so much in New Horizons that it has me just as excited to see what people create as recent, lauded craft-'em-ups like Super Mario Maker 2 or Dreams.\n\n- IGN Review (Ign.com)",
            "Mario Kart 8 Deluxe is an amazing game for all the same reasons I mentioned in our original review. It's still a gorgeous kart racer and every bit as addictive as it was in 2014. This is the best entry in the series so far, and it has all the content you'll need.\n\n- IGN Review (Ign.com)",
            "Fire Emblem: Three Houses succeeds in its ambitious telling of a land at war helmed by captivating leaders, in which no side has all the answers. Its tense battles are made all the more harrowing thanks to new strategy elements, and the colorful cast of troops you send into the fray are incredibly charming.\n\n- IGN Review (Ign.com)",
            "Sword and Shield are extremely familiar and comfortable thanks to a pretty traditional setup: you pick one of three starter Pokemon and then head off across the Galar region to capture and train more, defeat eight unique and exciting gym challenges, and become a Pokemon master over the course of about 40 hours.\n\n- IGN Review (Ign.com)",
            "Super Smash Bros. Ultimate lives up to its name, offering the most comprehensive game in the series to date. It has an absurd amount to play, fight, and unlock – though that can be to its detriment at times. While the World of Light adventure mode isn’t reason alone to get Smash Bros., it’s still a consistently amusing and shockingly large campaign, and a worthy compliment to Ultimate’s incredible multiplayer core. The Smash Bros. series has always maintained a wonderful balance of chaotic beat-em-up fun and tense fighting game action, and Super Smash Bros. Ultimate refines and improves on both sides of itself without abandoning either one.\n\n- IGN Review (Ign.com)",
            "There’s a lot to love in Nintendo’s second iteration of its quirky shooter, especially the way Splatoon 2 emphasizes splatting the ground just as much as it does inking your opponents. The new additions to its single-player campaign and multiplayer modes are a step in the right direction, but it still has some work to do to make joining online games and voice chat less of a hassle. Still, with an addicting new Salmon Run co-op mode and the promise of free updates like the ones that helped the original Splatoon come into its own, I expect Splatoon 2 to keep me hooked.\n\n- IGN Review (Ign.com)",
            "Mario, it turns out, isn’t the only plumber in Nintendo’s employ who can carry his own great game. Luigi’s Mansion 3 is so much fun, so charming, and so smartly designed that, moving forward, I really hope we get more than three of these games every 20 years. It’s absolutely the best Ghostbusters game ever made – it just happens to star Mario’s scaredy-cat brother rather than Peter Venkman and Ray Stantz.\n\n- IGN Review (Ign.com)",
            "Octopath Traveler is a JRPG dream come true. Both its battle system and aesthetic pay loving tribute to the Super NES era while moving the formula forward in exciting and novel ways. This isn’t merely a modern retread of past classics, but a phenomenal homage with genuinely fresh ideas in a fantastically charming wrapper of old-school meets new. While the eight different character stories could’ve used a little more connection between them, I’m looking forward to going back to complete them all, explore the many side areas, battle optional bosses, and unlock the final job classes.\n\n- IGN Review (Ign.com)")

    val listData: ArrayList<Game>
        get() {
            val list = arrayListOf<Game>()
            for (position in gameNames.indices) {
                val game = Game()
                game.name = gameNames[position]
                game.detail = gameDetails[position]
                game.photo = gamesImages[position]
                game.title = gameTitles[position]
                game.picture = gamePictures[position]
                game.genre = gameGenres[position]
                game.release = gameReleases[position]
                game.age = gameAges[position]
                game.desc = gameDescriptions[position]
                list.add(game)
            }
            return list
        }
}
/*
sources (pictures)
https://en.wikipedia.org/wiki/The_Legend_of_Zelda:_Breath_of_the_Wild
https://www.amazon.co.uk/Super-Mario-Odyssey-Nintendo-Switch/dp/B01MUA0D2A
https://en.wikipedia.org/wiki/Super_Mario_Odyssey
https://id.wikipedia.org/wiki/Animal_Crossing:_New_Horizons
https://mariokart.fandom.com/wiki/Mario_Kart_8_Deluxe
https://en.wikipedia.org/wiki/Fire_Emblem:_Three_Houses
https://hhsherald.com/16456/news/pokemon-sword-shield-what-we-know-so-far/
https://eshop-prices.com/games/1566-super-smash-bros-ultimate?currency=EUR
https://en.wikipedia.org/wiki/Splatoon_2
https://en.wikipedia.org/wiki/Luigi%27s_Mansion_3
https://en.wikipedia.org/wiki/Octopath_Traveler*/
