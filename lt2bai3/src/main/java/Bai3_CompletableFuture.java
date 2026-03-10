import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Bai3_CompletableFuture {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        System.out.println("=== BÀI 3 – COMPLETABLEFUTURE ===");
        System.out.println("[Main] Bắt đầu quá trình đặt vé...\n");
        CompletableFuture<String> validateFuture = CompletableFuture.supplyAsync(() -> {
            System.out.println("[Thread-1] Đang xác thực khách hàng...");
            try {
                Thread.sleep(2000); 
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("[Thread-1] Xác thực khách hàng hoàn thành!");
            return "Khách hàng hợp lệ";
        });
        CompletableFuture<String> ticketFuture = CompletableFuture.supplyAsync(() -> {
            System.out.println("[Thread-2] Đang tạo vé xem phim...");
            try {
                Thread.sleep(1500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("[Thread-2] Xuất vé thành công!");
            return "Vé #VIP-2024-001"; 
        });
        CompletableFuture<String> combinedFuture = validateFuture.thenCombine(
            ticketFuture,
            (result1, result2) -> {
                return result1 + " | " + result2;
            }
        );
        String finalResult = combinedFuture.get();
        System.out.println("\n[Main] Kết quả tổng hợp: " + finalResult);
        System.out.println("[Main] Ticket booking completed");
    }
}