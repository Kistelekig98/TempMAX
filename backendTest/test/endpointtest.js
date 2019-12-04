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
    describe("GET /forecast", () => {
        it("should return all temps", (done) => {
            chai.request(app)
                .get('/forecast')
                .end((err, res) => {
                    res.should.have.status(200);
                    res.body.should.be.a('array');
                    done();
                });
        });
    });
    describe("POST /temps", () => {
        it("should Create new record", (done) => {
            chai.request(app)
                .post('/temps')
                .set("content-type","application/json")
                .send({
                    place:"Test city",
                    temperature:13,
					humidity: 0.5,
					windDirection: 15,
					windSpeed: 12,
					lat: 12.33,
					lng: 55.333,
                })
                .end((err, res) => {
					console.log(res.body)
                    res.should.have.status(200);
                    done();
                   
                });
        });

    });
    describe("POST /forecast", () => {
        it("should Create new record", (done) => {
            chai.request(app)
                .post('/forecast')
                .set("content-type","application/json")
                .send({
                    title:"Szeged",
                    details:"testestsetest",
               
                })
                .end((err, res) => {
                                        console.log(res.body)
                    res.should.have.status(200);
                    done();

                });
        });

    });
   
    
});
 
