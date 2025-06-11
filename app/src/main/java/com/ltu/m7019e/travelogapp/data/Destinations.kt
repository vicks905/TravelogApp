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
                imageUrl = "https://plus.unsplash.com/premium_photo-1661914240950-b0124f20a5c1?fm=jpg&q=60&w=3000&ixlib=rb-4.1.0&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MXx8dG9reW98ZW58MHx8MHx8fDA%3D",
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
                imageUrl = "https://res.cloudinary.com/manawa/image/private/s--_OzFDCYE--/v1725534294/hebnsqjvxshq5t1krsku.jpg",
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
                imageUrl = "https://upload.wikimedia.org/wikipedia/commons/0/04/Lights_of_Rockefeller_Center_during_sunset.jpg",
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
                imageUrl = "https://cdn.britannica.com/42/126842-050-0803BC41/Sea-Point-Cape-Town-SAf.jpg",
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
                imageUrl = "https://cdn.britannica.com/03/94403-050-03683FB0/Rio-de-Janeiro-Braz.jpg",
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
                imageUrl = "https://media.istockphoto.com/id/539115110/photo/colosseum-in-rome-and-morning-sun-italy.jpg?s=612x612&w=0&k=20&c=9NtFxHI3P2IBWRY9t0NrfPZPR4iusHmVLbXg2Cjv9Fs=",
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
                imageUrl = "https://upload.wikimedia.org/wikipedia/commons/c/c9/Queenstown_1_%288168013172%29.jpg",
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
                imageUrl = "https://cdn.britannica.com/15/189715-050-4310222B/Dubai-United-Arab-Emirates-Burj-Khalifa-top.jpg",
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
                imageUrl = "https://upload.wikimedia.org/wikipedia/commons/thumb/c/c5/Moraine_Lake_17092005.jpg/960px-Moraine_Lake_17092005.jpg",
                videoUrl = "https://commondatastorage.googleapis.com/gtv-videos-bucket/sample/WeAreGoingOnBullrun.mp4"
            )

        )
    }
}