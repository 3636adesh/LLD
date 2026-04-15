/**  Bad Design (Multiple Responsibilities)
 * class Invoice {
 *     public void calculateTotal() {
 *         // calculation logic
 *     }
 *
 *     public void printInvoice() {
 *         // printing logic
 *     }
 *
 *     public void saveToDB() {
 *         // database logic
 *     }
 * }
 */

/**
 *  Good Design (Separated Responsibilities)
 *
 *
 *  class Invoice {
 *     public void calculateTotal() {
 *         // calculation logic
 *     }
 * }
 *
 * class InvoicePrinter {
 *     public void print(Invoice invoice) {
 *         // printing logic
 *     }
 * }
 *
 * class InvoiceRepository {
 *     public void save(Invoice invoice) {
 *         // database logic
 *     }
 * }
 *
 */