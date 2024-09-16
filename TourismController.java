package com.mn.tourism;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class TourismController {

	@Autowired
	TourRepository tourRepository;

	@GetMapping("/home")
	public String getPage() {
		return "home";
	}

	public List<Tours> getAllToursOrdered() {
		return tourRepository.findAllOrdered();
	}

	@RequestMapping("/submitTour")
	public String submitTour(@RequestBody Tours tour, Model model) {
		Long id = tour.getId();
		Optional<Tours> optionalTour = tourRepository.findById(id);
		if (optionalTour.isPresent()) {
			model.addAttribute("tour", optionalTour.get()); // Use 'tour' instead of 'tours'
		} else {
			model.addAttribute("tour", null); // Handle case where tour is not found
		}
		return "t";
	}

}
