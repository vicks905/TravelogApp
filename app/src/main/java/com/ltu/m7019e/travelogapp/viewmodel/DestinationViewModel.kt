package com.ltu.m7019e.travelogapp.viewmodel

import androidx.lifecycle.ViewModel
import com.ltu.m7019e.travelogapp.model.Destination

class DestinationViewModel : ViewModel() {
    private val _destinations = mutableListOf<Destination>()

    fun getDestinations(): List<Destination> {
        return _destinations
    }

    fun addDestination(destination: Destination) {
        _destinations.add(destination)
    }
}