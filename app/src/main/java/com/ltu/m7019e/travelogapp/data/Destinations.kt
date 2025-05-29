package com.ltu.m7019e.travelogapp.data

import com.ltu.m7019e.travelogapp.model.Destination

class Destinations {
    fun getDestinations(): List<Destination> {
        return listOf(
            Destination(
                id = 2,
                name = "Tokyo",
                description = "Tokyo blends cutting-edge modernity with traditional temples and tranquil gardens.",
                country = "Japan",
                location = "35.6762,139.6503",
                type = "City",
                wikiUrl = "https://en.wikipedia.org/wiki/Tokyo",
                imageUrl = "https://upload.wikimedia.org/wikipedia/commons/1/19/Tokyo_Montage_2021.jpg",
                videoUrl = "https://commondatastorage.googleapis.com/gtv-videos-bucket/sample/Sintel.mp4"
            ),
            Destination(
                id = 1,
                name = "Paris",
                description = "Known as the City of Light, Paris offers iconic landmarks, rich culture, and world-class cuisine.",
                country = "France",
                type = "Culture",
                location = "48.8566,2.3522",
                wikiUrl = "https://en.wikipedia.org/wiki/Paris",
                imageUrl = "https://upload.wikimedia.org/wikipedia/commons/e/e6/Paris_Night.jpg",
                videoUrl = "https://commondatastorage.googleapis.com/gtv-videos-bucket/sample/ForBiggerJoyrides.mp4"
            ),
            Destination(
                id = 3,
                name = "Santorini",
                description = "Famous for its whitewashed buildings and stunning sunsets over the Aegean Sea.",
                country = "Greece",
                type = "Beach",
                location = "36.3932,25.4615",
                wikiUrl = "https://en.wikipedia.org/wiki/Santorini",
                imageUrl = "https://upload.wikimedia.org/wikipedia/commons/1/10/Santorini_sunset.jpg",
                videoUrl = "https://commondatastorage.googleapis.com/gtv-videos-bucket/sample/ElephantsDream.mp4"
            ),
            Destination(
                id = 4,
                name = "New York City",
                description = "The Big Apple is a global hub of entertainment, finance, and culture.",
                country = "USA",
                type = "Urban",
                location = "40.7128,-74.0060",
                wikiUrl = "https://en.wikipedia.org/wiki/New_York_City",
                imageUrl = "https://upload.wikimedia.org/wikipedia/commons/4/4d/NYC_Midtown_Skyline.jpg",
                videoUrl = "https://commondatastorage.googleapis.com/gtv-videos-bucket/sample/TearsOfSteel.mp4"
            ),
            Destination(
                id = 5,
                name = "Cape Town",
                description = "Cape Town is known for its harbor, Table Mountain, and rich biodiversity.",
                country = "South Africa",
                type = "Nature",
                location = "-33.9249,18.4241",
                wikiUrl = "https://en.wikipedia.org/wiki/Cape_Town",
                imageUrl = "https://upload.wikimedia.org/wikipedia/commons/b/b6/Cape_Town_Montage_2021.png",
                videoUrl = "https://commondatastorage.googleapis.com/gtv-videos-bucket/sample/BigBuckBunny.mp4"
            ),
            Destination(
                id = 6,
                name = "Rio de Janeiro",
                description = "Famous for its Carnival, Copacabana beach, and the Christ the Redeemer statue.",
                country = "Brazil",
                location = "-22.9068,-43.1729",
                type = "Festival",
                wikiUrl = "https://en.wikipedia.org/wiki/Rio_de_Janeiro",
                imageUrl = "https://upload.wikimedia.org/wikipedia/commons/5/53/Rio_de_Janeiro_2014.jpg",
                videoUrl = "https://commondatastorage.googleapis.com/gtv-videos-bucket/sample/SubaruOutbackOnStreetAndDirt.mp4"
            ),
            Destination(
                id = 7,
                name = "Rome",
                description = "Rome boasts ancient history, the Colosseum, the Vatican, and Renaissance architecture.",
                country = "Italy",
                location = "41.9028,12.4964",
                type = "Historic",
                wikiUrl = "https://en.wikipedia.org/wiki/Rome",
                imageUrl = "https://upload.wikimedia.org/wikipedia/commons/e/e7/Rome_Montage_2017.png",
                videoUrl = "https://commondatastorage.googleapis.com/gtv-videos-bucket/sample/VolkswagenGTIReview.mp4"
            ),
            Destination(
                id = 8,
                name = "Queenstown",
                description = "Known for adventure sports and scenic landscapes, nestled by lakes and mountains.",
                country = "New Zealand",
                location = "-45.0312,168.6626",
                type = "Adventure",
                wikiUrl = "https://en.wikipedia.org/wiki/Queenstown,_New_Zealand",
                imageUrl = "https://upload.wikimedia.org/wikipedia/commons/e/e3/Queenstown_NZ.jpg",
                videoUrl = "https://commondatastorage.googleapis.com/gtv-videos-bucket/sample/Sintel.mp4"
            ),
            Destination(
                id = 9,
                name = "Dubai",
                description = "Futuristic skyline, luxury shopping, and desert adventures await in this UAE gem.",
                country = "United Arab Emirates",
                location = "25.276987,55.296249",
                type = "Luxury",
                wikiUrl = "https://en.wikipedia.org/wiki/Dubai",
                imageUrl = "https://upload.wikimedia.org/wikipedia/commons/0/0c/Dubai_Skyline.jpg",
                videoUrl = "https://commondatastorage.googleapis.com/gtv-videos-bucket/sample/ForBiggerEscapes.mp4"
            ),
            Destination(
                id = 10,
                name = "Banff",
                description = "A pristine Canadian town surrounded by mountains, lakes, and natural beauty.",
                country = "Canada",
                location = "51.1784,-115.5708",
                type = "Nature",
                wikiUrl = "https://en.wikipedia.org/wiki/Banff,_Alberta",
                imageUrl = "https://upload.wikimedia.org/wikipedia/commons/1/1d/Banff_National_Park.jpg",
                videoUrl = "https://commondatastorage.googleapis.com/gtv-videos-bucket/sample/WeAreGoingOnBullrun.mp4"
            )

        )
    }
}