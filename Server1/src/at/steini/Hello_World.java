
package at.steini;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

import javax.imageio.ImageIO;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Hello_World
 */
@WebServlet("/Hello_World")
public class Hello_World extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Hello_World() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		 response.setContentType("image/jpeg");
//	        PrintWriter out = response.getWriter();
//	        out.println("<html>");
//	        out.println("<head>");
//	        out.println("<title>Hello World!</title>");
//	        out.println("<h1>Hallo wie geht es dir?</h1>");
//	        out.println("</head>");
//	        out.println("<body>");
//	        out.println("<h1>Hello World!</h1>");
//	        out.println("</body>");
//	        out.println("</html>");
	        
	        BufferedImage b = new BufferedImage(200, 200, BufferedImage.TYPE_INT_RGB);
	        Graphics g = b.getGraphics();
	        //g.setColor(Color.YELLOW);
	        //g.fillOval(0, 7, 100, 100);
	        //g.fillRect(0, 5, 100, 100);
	        Random r = new Random();
	        switch (r.nextInt(6)+1) {
			case 0:
				g.setColor(Color.GREEN);
				g.fillOval(0, 7, 100, 100);
				break;
			case 1:
				g.setColor(Color.YELLOW);
				g.fillOval(0, 7, 100, 100);
				
				break;
			case 2:
				g.setColor(Color.PINK);
				g.fillOval(0, 7, 100, 100);
				
				break;
			case 3:
				g.setColor(Color.GREEN);
				g.fillRect(0, 7, 100, 100);
				
				break;
			case 4:
				g.setColor(Color.YELLOW);
				g.fillRect(0, 7, 100, 100);
				
				break;
			case 5:
				g.setColor(Color.RED);
				g.fillRect(0, 7, 100, 100);
				
				break;
			case 6:
				g.setColor(Color.GREEN);
				g.fillRect(0, 7, 100, 100);
				
				break;

			}
	        g.dispose();
	        ImageIO.write(b, "jpeg", response.getOutputStream());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
