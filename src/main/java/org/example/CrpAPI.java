package org.example;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;



enum Doctype {
    LP_INTRODUCE_GOODS("LP_INTRODUCE_GOODS");
    private String type;

    Doctype(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}

// class model
class ParticipantInn {
    private String participantInn;

    public ParticipantInn() {
    }

    public ParticipantInn(String participantInn) {
        this.participantInn = participantInn;
    }

    public String getParticipantInn() {
        return participantInn;
    }

    public void setParticipantInn(String participantInn) {
        this.participantInn = participantInn;
    }
}

class Product {
    private String certificateDocument;
    private String certificateDocumentDate; //2020-01-23",
    private String certificateDocumentNumber;
    private String ownerInn;
    private String producerInn;
    private String productionDate; //2020-01-23",
    private String tnvedCode;
    private String uitCode;
    private String uituCode;

    public Product() {
    }

    public Product(String certificateDocument, String certificateDocumentDate, String certificateDocumentNumber,
                   String ownerInn, String producerInn, String productionDate, String tnvedCode, String uitCode,
                   String uituCode) {
        this.certificateDocument = certificateDocument;
        this.certificateDocumentDate = certificateDocumentDate;
        this.certificateDocumentNumber = certificateDocumentNumber;
        this.ownerInn = ownerInn;
        this.producerInn = producerInn;
        this.productionDate = productionDate;
        this.tnvedCode = tnvedCode;
        this.uitCode = uitCode;
        this.uituCode = uituCode;
    }

    public String getCertificateDocument() {
        return certificateDocument;
    }

    public void setCertificateDocument(String certificateDocument) {
        this.certificateDocument = certificateDocument;
    }

    public String getCertificateDocumentDate() {
        return certificateDocumentDate;
    }

    public void setCertificateDocumentDate(String certificateDocumentDate) {
        this.certificateDocumentDate = certificateDocumentDate;
    }

    public String getCertificateDocumentNumber() {
        return certificateDocumentNumber;
    }

    public void setCertificateDocumentNumber(String certificateDocumentNumber) {
        this.certificateDocumentNumber = certificateDocumentNumber;
    }

    public String getOwnerInn() {
        return ownerInn;
    }

    public void setOwnerInn(String ownerInn) {
        this.ownerInn = ownerInn;
    }

    public String getProducerInn() {
        return producerInn;
    }

    public void setProducerInn(String producerInn) {
        this.producerInn = producerInn;
    }

    public String getProductionDate() {
        return productionDate;
    }

    public void setProductionDate(String productionDate) {
        this.productionDate = productionDate;
    }

    public String getTnvedCode() {
        return tnvedCode;
    }

    public void setTnvedCode(String tnvedCode) {
        this.tnvedCode = tnvedCode;
    }

    public String getUitCode() {
        return uitCode;
    }

    public void setUitCode(String uitCode) {
        this.uitCode = uitCode;
    }

    public String getUituCode() {
        return uituCode;
    }

    public void setUituCode(String uituCode) {
        this.uituCode = uituCode;
    }
}

class Document {
    private ParticipantInn description;
    private String docId;
    private String docStatus;
    private Doctype docType;
    private boolean importRequest;
    private String ownerInn;
    private String participantInn;
    private String producerInn;
    private String productionDate;
    private String productionType;
    private List<Product> products;
    private String regDate; //2020-01-23;
    private String regNumber;

    public Document() {
    }

    public Document(ParticipantInn description, String docId, String docStatus, Doctype docType, boolean importRequest,
                    String ownerInn, String participantInn, String producerInn, String productionDate,
                    String productionType, List<Product> products, String regDate, String regNumber) {
        this.description = description;
        this.docId = docId;
        this.docStatus = docStatus;
        this.docType = docType;
        this.importRequest = importRequest;
        this.ownerInn = ownerInn;
        this.participantInn = participantInn;
        this.producerInn = producerInn;
        this.productionDate = productionDate;
        this.productionType = productionType;
        this.products = products;
        this.regDate = regDate;
        this.regNumber = regNumber;
    }

    public ParticipantInn getDescription() {
        return description;
    }

    public void setDescription(ParticipantInn description) {
        this.description = description;
    }

    public String getDocId() {
        return docId;
    }

    public void setDocId(String docId) {
        this.docId = docId;
    }

    public String getDocStatus() {
        return docStatus;
    }

    public void setDocStatus(String docStatus) {
        this.docStatus = docStatus;
    }

    public Doctype getDocType() {
        return docType;
    }

    public void setDocType(Doctype docType) {
        this.docType = docType;
    }

    public boolean isImportRequest() {
        return importRequest;
    }

    public void setImportRequest(boolean importRequest) {
        this.importRequest = importRequest;
    }

    public String getOwnerInn() {
        return ownerInn;
    }

    public void setOwnerInn(String ownerInn) {
        this.ownerInn = ownerInn;
    }

    public String getParticipantInn() {
        return participantInn;
    }

    public void setParticipantInn(String participantInn) {
        this.participantInn = participantInn;
    }

    public String getProducerInn() {
        return producerInn;
    }

    public void setProducerInn(String producerInn) {
        this.producerInn = producerInn;
    }

    public String getProductionDate() {
        return productionDate;
    }

    public void setProductionDate(String productionDate) {
        this.productionDate = productionDate;
    }

    public String getProductionType() {
        return productionType;
    }

    public void setProductionType(String productionType) {
        this.productionType = productionType;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public String getRegDate() {
        return regDate;
    }

    public void setRegDate(String regDate) {
        this.regDate = regDate;
    }

    public String getRegNumber() {
        return regNumber;
    }

    public void setRegNumber(String regNumber) {
        this.regNumber = regNumber;
    }
}


// DTO's models
record ParticipantInnDto(String participant_inn) {
}

record ProductDto(
        String certificate_document,
        String certificate_document_date,
        String certificate_document_number,
        String owner_inn,
        String producer_inn,
        String production_date,
        String tnved_code,
        String uit_code,
        String uitu_code) {
}

record DocumentDto(
        ParticipantInnDto description,
        String docId,
        String doc_status,
        Doctype doc_type,
        boolean importRequest,
        String owner_inn,
        String participant_inn,
        String producer_inn,
        String production_date,
        String production_type,
        List<ProductDto> products,
        String reg_date, //2020-01-23;
        String reg_number
) {
}


// Mappers to convert from model to DTO and DTO to model
class ParticipantInnMapper {
    public static ParticipantInnDto modelToDto(ParticipantInn model) {
        return model == null ? null : new ParticipantInnDto(model.getParticipantInn());
    }

    public static ParticipantInn dtoToModel(ParticipantInnDto dto) {
        return dto == null ? null : new ParticipantInn(dto.participant_inn());
    }
}

class ProductMapper {
    public static Product dtoToModel(ProductDto dto) {
        return dto == null ? null : new Product(
                dto.certificate_document(),
                dto.certificate_document_date(),
                dto.certificate_document_number(),
                dto.owner_inn(),
                dto.producer_inn(),
                dto.production_date(),
                dto.tnved_code(),
                dto.uit_code(),
                dto.uitu_code()
        );
    }

    public static ProductDto modelToDto(Product model) {
        return model == null ? null : new ProductDto(
                model.getCertificateDocument(),
                model.getCertificateDocumentDate(),
                model.getCertificateDocumentNumber(),
                model.getOwnerInn(),
                model.getProducerInn(),
                model.getProductionDate(),
                model.getTnvedCode(),
                model.getUitCode(),
                model.getUituCode()
        );
    }
}

class DocumentMapper {
    public static DocumentDto modelToDto(Document model) {
        return model == null ? null : new DocumentDto(
                ParticipantInnMapper.modelToDto(model.getDescription()),
                model.getDocId(),
                model.getDocStatus(),
                model.getDocType(),
                model.isImportRequest(),
                model.getOwnerInn(),
                model.getParticipantInn(),
                model.getProducerInn(),
                model.getProductionDate(),
                model.getProductionType(),
                model.getProducts().stream().map(ProductMapper::modelToDto).toList(),
                model.getRegDate(), //2020-01-23;
                model.getRegNumber());
    }

    public static Document dtoToModel(DocumentDto dto) {
        return dto == null ? null : new Document(
                ParticipantInnMapper.dtoToModel(dto.description()),
                dto.docId(),
                dto.doc_status(),
                dto.doc_type(),
                dto.importRequest(),
                dto.owner_inn(),
                dto.participant_inn(),
                dto.producer_inn(),
                dto.production_date(),
                dto.production_type(),
                dto.products().stream().map(ProductMapper::dtoToModel).toList(),
                dto.reg_date(), //2020-01-23;
                dto.reg_number());
    }
}



public class CrpAPI {
    private final Lock lock = new ReentrantLock();
    private final TimeUnit timeUnit;
    private final int requestLimit;
    private long lastRequestTime;
    private int requestCount;
    private final HttpClient httpClient;
    private final ObjectMapper objectMapper;


    public CrpAPI(TimeUnit timeUnit, int requestLimit) {
        this.timeUnit = timeUnit;
        this.requestLimit = requestLimit;
        this.lastRequestTime = System.currentTimeMillis();
        this.requestCount = 0;
        this.httpClient = HttpClient.newHttpClient();
        this.objectMapper = new ObjectMapper();
    }

    public void createDocument(Document document, String signature) {
        lock.lock();
        try {
            long currentTime = System.currentTimeMillis();
            long elapsedTime = currentTime - lastRequestTime;
            long intervalInMillis = timeUnit.toMillis(1);

            if (elapsedTime > intervalInMillis) {
                // Reset request count if the time interval has passed
                requestCount = 0;
                lastRequestTime = currentTime;
            }

            if (requestCount < requestLimit) {
                // Perform the API call
                performApiCall(document, signature);

                // Increment the request count
                requestCount++;
            } else {
                // Block the request if the limit is exceeded
                // If the request limit is exceeded, wait until the new interval starts
//                try {
//                    Thread.sleep(intervalInMillis - elapsedTime);
                System.out.println("Request limit exceeded. Blocking the request.");
//                } catch (InterruptedException e) {
//                    Thread.currentThread().interrupt();
//                }
            }
        } finally {
            lock.unlock();
        }
    }

    // Implement the HTTPS POST call to the API here
    private void sendHttpPostRequest(DocumentDto document, String signature) {
        try {
            String apiUrl = "https://ismp.crpt.ru/api/v3/lk/documents/create";
            String requestBody = convertObjectToJsonString(document);
//            System.out.println(requestBody);

            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(apiUrl))
                    .header("Content-Type", "application/json")
                    .POST(HttpRequest.BodyPublishers.ofString(requestBody))
                    .build();

            HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());

            // Handle the response if needed
            int statusCode = response.statusCode();
            if (statusCode == 201 || statusCode == 200) {
                // Processing response code and response body
                String responseBody = response.body();

                //converting to a Java Object and printing...
                System.out.println(convertJsonStringToObject(responseBody));


            } else {
                System.out.println("Ops, something went wrong!");
            }

        } catch (IOException | InterruptedException e) {
            e.printStackTrace(); // Handle exception accordingly
        }
    }

    private String convertObjectToJsonString(DocumentDto object) throws IOException {
        return objectMapper.writeValueAsString(object);
    }

    private Document convertJsonStringToObject(String response) throws IOException {
        return DocumentMapper.dtoToModel(objectMapper.readValue(response, DocumentDto.class));
    }


    private void performApiCall(Document document, String signature) {
        //Calling the method for POST Request
        //TODO: Uncomment the line below to send a real request to "ismp.crpt.ru" API
//        sendHttpPostRequest(document, signature);


        // Use the provided document and signature parameters
        System.out.println("API call performed with document and signature.");
    }

    // Additional methods can be added as needed for other API operations

    public static void main(String[] args) {
        // Example usage
        CrpAPI crptApi = new CrpAPI(TimeUnit.SECONDS, 5);

        // Make multiple calls to demonstrate the request limit
        for (int i = 0; i < 15; i++) {
            crptApi.createDocument(new Document(), "sampleSignature");
        }
    }
}
