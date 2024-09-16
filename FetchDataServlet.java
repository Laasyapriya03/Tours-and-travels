package com.mn.tourism;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;

@WebServlet("/fetch_data")
public class FetchDataServlet extends HttpServlet {

//    private TourDAO tourDAO = new TourDAO();
//
//    @Override
//    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        String query = request.getParameter("query");
//        if (query == null) query = "";  // Default to empty if no query is provided
//
//        try {
//            List<Tour> tours = tourDAO.getToursByQuery(query);
//            request.setAttribute("tours", tours);
//            request.getRequestDispatcher("getData.jsp").forward(request, response);
//        } catch (SQLException e) {
//            response.sendError(HttpServletResponse.SC_INTERNAL_SERVER_ERROR, "Database error");
//            e.printStackTrace();
//        }
//    }
}
