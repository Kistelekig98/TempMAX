import chai from 'chai';
import chaiHttp from 'chai-http';
const app ="http://localhost:8080";

chai.use(chaiHttp);
chai.should();
describe("Temps", () => {
    describe("GET /temps", () => {
        it("should return all temps", (done) => {
            chai.request(app)
                .get('/temps')
                .end((err, res) => {
                    res.should.have.status(200);
                    res.body.should.be.a('array');
                    done();
                });
        });
    });
    describe("POST /temps", () => {
        let created_id=null;
        it("should Create new record", (done) => {
            chai.request(app)
                .post('/temps')
                .set("content-type","application/json")
                .send({
                    place:"Test city",
                    temperature:13
                })
                .end((err, res) => {
				
                    res.should.have.status(200);
                    done();
                   
                });
        });


    });
    
});
 
