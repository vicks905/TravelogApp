package com.ltu.m7019e.travelogapp.database

class Destinations {
    fun getDestinations(): List<Destination> {
        return listOf(
            Destination(
                id = 1,
                name = "Paris",
                description = "Known as the City of Light, Paris offers iconic landmarks, rich culture, and world-class cuisine.",
                country = "France",
                type = "Culture",
                location = "48.8566,2.3522",
                wikiUrl = "https://en.wikipedia.org/wiki/Paris",
                imageUrl = "https://upload.wikimedia.org/wikipedia/commons/e/e6/Paris_Night.jpg",
                videoUrl = "https://www.youtube.com/watch?v=_xQF05x2Qeo"
            ),
            Destination(
                id = 2,
                name = "Tokyo",
                description = "Tokyo blends cutting-edge modernity with traditional temples and tranquil gardens.",
                country = "Japan",
                type = "City",
                location = "35.6762,139.6503",
                wikiUrl = "https://en.wikipedia.org/wiki/Tokyo",
                imageUrl = "https://upload.wikimedia.org/wikipedia/commons/1/19/Tokyo_Montage_2021.jpg",
                videoUrl = "https://www.youtube.com/watch?v=Lj6Y6kzjkJ8"
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
                videoUrl = "https://www.youtube.com/watch?v=8l-ZH5jzvmI"
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
                videoUrl = "https://www.youtube.com/watch?v=HiXZr3D7tW4"
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
                videoUrl = "https://www.youtube.com/watch?v=6Lz1JqxRXxY"
            )
        )
    }
}