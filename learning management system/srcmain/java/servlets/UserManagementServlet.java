@WebServlet("/user")
public class ExampleServlet extends HttpServlet {
    @Override
    public void init() throws ServletException {
        super.init();
        System.out.println("Servlet Initialized");
    }
}
