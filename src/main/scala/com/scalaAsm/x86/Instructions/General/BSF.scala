package com.scalaAsm.x86
package Instructions
package General

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Bit Scan Forward
// Category: general/bit

trait BSF extends InstructionDefinition {
  val mnemonic = "BSF"
}

object BSF extends TwoOperands[BSF] with BSFImpl

trait BSFImpl extends BSF {
  implicit object BSF_0 extends _2[r16, rm16] {
    val opcode: TwoOpcodes = (0x0F, 0xBC) /r
    val explicitFormat = new RegRmFormat{}
  }

  implicit object BSF_1 extends _2[r32, rm32] {
    val opcode: TwoOpcodes = (0x0F, 0xBC) /r
    val explicitFormat = new RegRmFormat{}
  }

  implicit object BSF_2 extends _2[r64, rm64] {
    val opcode: TwoOpcodes = (0x0F, 0xBC) /r
    override def prefix = REX.W(true)
    val explicitFormat = new RegRmFormat{}
  }
}
