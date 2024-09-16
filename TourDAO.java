package com.mn.tourism;

public class TourDAO {

//    private static final String DB_URL = "jdbc:mysql://localhost:3306/bonvoyage"; // Adjust your DB URL
//    private static final String USER = "root"; // Adjust your DB username
//    private static final String PASS = "password"; // Adjust your DB password
//
//    // Method to get tour by ID
//    public Tour getTourById(int tourId) throws SQLException {
//        Tour tour = null;
//        String sql = "SELECT * FROM tours WHERE TourID = '"+tourId+"'";
//
//        try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
//             PreparedStatement stmt = conn.prepareStatement(sql)) {
//
//            stmt.setInt(1, tourId);
//            ResultSet rs = stmt.executeQuery();
//
//            if (rs.next()) {
//                tour = new Tour();
//                tour.setTourName(rs.getString("TourName"));
//                tour.setDestination(rs.getString("Destination"));
//                tour.setStartDate(rs.getDate("StartDate").toString());
//                tour.setEndDate(rs.getDate("EndDate").toString());
//                tour.setPrice(rs.getBigDecimal("Price").doubleValue());
//            }
//        }
//        return tour;
//    }
}


