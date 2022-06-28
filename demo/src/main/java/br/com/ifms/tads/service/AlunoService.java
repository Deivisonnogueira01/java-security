package br.com.ifms.tads.service;

import java.util.List;

import org.springframework.stereotype.Service;

import br.com.ifms.tads.javabeans.Aluno;
import br.com.ifms.tads.service.interfaces.AlunoServiceInterface;

@Service
public class AlunoService implements AlunoServiceInterface {

    @Override
    public Aluno addAluno(Aluno aluno) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public long delete(long idAluno) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public Aluno update(Aluno alunoUp) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Aluno findById(long id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<Aluno> listAll() {
        // TODO Auto-generated method stub
        return null;
    }
    
}
