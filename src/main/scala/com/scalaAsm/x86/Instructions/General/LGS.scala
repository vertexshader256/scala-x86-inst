package com.scalaAsm.x86
package Instructions
package General

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Load Far Pointer
// Category: general/datamovsegreg

trait LGS extends InstructionDefinition {
  val mnemonic = "LGS"
}

object LGS extends TwoOperands[LGS] with LGSImpl

trait LGSImpl extends LGS {
  implicit object LGS_0 extends _2[r16, m] {
    val opcode: TwoOpcodes = (0x0F, 0xB5) /r
    val explicitFormat = new RegRmFormat{}
    override def hasImplicitOperand = true
  }

  implicit object LGS_1 extends _2[r32, m] {
    val opcode: TwoOpcodes = (0x0F, 0xB5) /r
    val explicitFormat = new RegRmFormat{}
    override def hasImplicitOperand = true
  }

  implicit object LGS_2 extends _2[r64, m] {
    val opcode: TwoOpcodes = (0x0F, 0xB5) /r
    override def prefix = REX.W(true)
    val explicitFormat = new RegRmFormat{}
    override def hasImplicitOperand = true
  }
}
